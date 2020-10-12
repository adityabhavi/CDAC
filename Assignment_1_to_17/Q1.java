//01. Create a program to create table named student having columns [ rno, name, marks, date of birth].

package Q1_Q18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Q1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","7775014945"); 
			Statement s = con.createStatement();
			s.execute("create table Student1(rno int primary key,name varchar(50),marks int,dob date)");
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
