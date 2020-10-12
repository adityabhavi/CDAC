//07. Create a program to search student record on the basis of given roll no.

package Q1_Q18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int rno=sc.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","7775014945"); 
			//Statement s = con.createStatement();
			String q = "select * from student1 where rno="+rno;
			PreparedStatement s = con.prepareStatement(q);
			ResultSet rs = s.executeQuery();
			if(rs.first()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDate(4));
			}else {
				System.out.println("Record Not Exists !!");
			}
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
