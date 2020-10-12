//09. Create a program to perform CRUD operation for student [ rno,name,marks,date of birth ] using PreparedStatement. Take values from keyboard.

package Q1_Q18;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rno,marks;
		String dob;
		String name;
		
		System.out.println("Enter the Choice : \n1.Insert the record. \n2.Read the record. \n3.Update the record. \n4.Delete the record.");
		int choice = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","7775014945"); 
			//Statement s = con.createStatement();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter the roll number : ");
				rno=sc.nextInt();
				System.out.println("Enter the name : ");
				name = sc.next();
				System.out.println("Enter the marks : ");
				marks=sc.nextInt();
				System.out.println("Enter the date of birth (yyyy-mm-dd) : ");
				dob = sc.next();
				String q="insert into student1 values("+rno+",'"+name+"',"+marks+",'"+dob+"')";
				PreparedStatement s = con.prepareStatement(q);
				
				int i=s.executeUpdate();
				System.out.println(i+" record added");
				con.close();
				break;
				
				
			
			case 2 :
				
					q = "select * from student1";
					s = con.prepareStatement(q);
					ResultSet rs = s.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDate(4));
					}
					con.close();
					break;
				
			case 3 :
				
					System.out.println("Enter the name : ");
					name=sc.next();
					System.out.println("Enter the roll number : ");
					rno = sc.nextInt();
					q="update student1 set name = '"+name+"' where rno="+rno;
					s=con.prepareStatement(q);
					i=s.executeUpdate();
					System.out.println(i+" record updated");
					con.close();
					break;
				
			case 4 :
				
					System.out.println("Enter the roll number : ");
					rno = sc.nextInt();
					q="delete from student1 where rno="+rno;
					s=con.prepareStatement(q);
					i=s.executeUpdate("delete from student1 where rno="+rno);
					System.out.println(i+" record deleted");
					con.close();
					break;
			default :
					System.out.println("Please enter valid choice !!!");
					break;
			}
			
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
	}

}
