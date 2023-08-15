package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Registration;


@WebServlet(urlPatterns = "/add")
public class Registration_servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		String username=req.getParameter("username");
		String email= req.getParameter("email");
		String password=req.getParameter("password");
		PrintWriter out  = res.getWriter();
		Registration p = new Registration();
		p.setUsername(username);
		p.setEmail(email);
		p.setPassword(password);
		try {
			int response = p.bookhovenia();
			if (response == 1) {
                // Redirect to login.jsp with registration success parameter
                res.sendRedirect("login.jsp?registrationSuccess=true");
            } else {
                // Redirect back to Registration.jsp with registration failure parameter
                res.sendRedirect("Registration.jsp?registrationSuccess=false");
            }
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


