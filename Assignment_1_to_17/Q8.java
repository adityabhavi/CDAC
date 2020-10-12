package Q1_Q18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q8 {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","7775014945"); 
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from student1");
			int sum=0,count=0;
			
			while(rs.next()) {
				sum=sum+rs.getInt(3);
				count++;
			}
			double avg=sum/count;
			System.out.println("Avg marks of all studets is : "+avg);
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
