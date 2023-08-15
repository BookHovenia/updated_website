package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Update these with your database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/website?useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM registration WHERE email=? AND password=?");
            pst.setString(1, email);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                // Authentication successful
                response.sendRedirect("home.jsp?loginSuccess=true");
            } else {
                // Authentication failed, redirect to the login page with an error parameter
                String loginPageURL = "login.jsp?loginError=true";
                response.sendRedirect(loginPageURL);
            }

            rs.close();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions, for example, redirect to an error page
            response.sendRedirect("error.jsp");
        }
    }
}
