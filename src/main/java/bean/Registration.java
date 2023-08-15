package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registration {
String username, email, password;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public Connection getconnect() throws SQLException{
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	
	String url = "jdbc:mysql://localhost:3306/website";
	String user = "root";
	String password = "";
	Connection conn=DriverManager.getConnection(url,user,password);
	return conn;
}
public int bookhovenia()throws SQLException{
	Connection con = getconnect();
	String sql="Insert into registration (username, email, password) values(?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, username);
	ps.setString(2, email);
	ps.setString(3, password);
	int response = ps.executeUpdate();
	return response;
	
}
}
