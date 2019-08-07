package Browser_Lunch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prasanna","root","prasanna@1234");
		System.out.println("connection established");
		
		Statement st=connection.createStatement();
		st.executeUpdate("insert into selenium values('12346546','utfbff')");
		ResultSet rs = st.executeQuery("select * from selenium");
		
		while(rs.next())
		{
			String email,password;
			email=rs.getString("email");
			password=rs.getString("password");
			System.out.println("  "+email+"  "+password);
		}

	}

}
