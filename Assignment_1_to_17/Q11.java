//Create a program to call a stored procedure, created to insert student record [ rno, name, marks].

package Q1_Q18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter roll no : ");
			int rno = sc.nextInt();
			System.out.println("Enter name : ");
			String name = sc.next();
			System.out.println("Enter marks : ");
			int marks = sc.nextInt();
			System.out.println("Enter date of birth (yyyy-mm-dd) : ");
			String dob = sc.next();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","7775014945"); 
			CallableStatement s = 
					con.prepareCall("{ call insert1("+rno+",'"+name+"',"+marks+",'"+dob+"')}");
			/*s.setInt(1, rno);
			s.setString(2, name);
			s.setInt(3, marks);
			s.setString(4, dob);*/
			int i = s.executeUpdate();	
			System.out.println(i+" record added");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
