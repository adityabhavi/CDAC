//12. There is need to store employee information [like : employee id, name, salary, join date] 
//	and employee's address information [like : address id, city, country, employee id]. Employee and Address
//	information should be stored in separate tables. Create a program which can insert employee and address records. 
//	First store employee record and then address record. Make sure, if the address record is not saved then employee 
//	transaction should be rollbacked.

package Q1_Q18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","7775014945"); 
		con.setAutoCommit(false);
		Statement s = con.createStatement();
		System.out.println("Enter the choice : \n1.Create table Employee and Adress \n2.Add Employee Details and Adress"
				+ "\n3.Show Employee Deatils ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();		
		switch(choice) {
		case 1:
			s.execute("create table if not exists Employee(empId int primary key,name varchar(50),salary int, doj date)");
			s.execute("create table if not exists Address(addId int primary key,city varchar(30),country varchar(30),empId int,foreign key(empId) references Employee(empId)" + 
					")");
			break;
		case 2:
			System.out.println("Enter Employee detail : ");
			System.out.println("Enter Employee Id : ");
			int empId = sc.nextInt();
			System.out.println("Enter Employee name : ");
			String name = sc.next();
			System.out.println("Entert the salary : ");
			int sal = sc.nextInt();
			System.out.println("Enter date of joing (yyyy-mm-dd) : ");
			String doj = sc.next();
			String q1 = "insert into Employee values("+empId+",'"+name+"',"+sal+",'"+doj+"')";
			boolean emp = s.execute(q1);
			System.out.println("Enter Employee Address");
			System.out.println("Enter Address Id : ");
			int addId = sc.nextInt();
			System.out.println("Enter the city : ");
			String city = sc.next();
			System.out.println("Enter the country : ");
			String country = sc.next();
			System.out.println("Enter the Employee Id  : ");
			int empId1 = sc.nextInt();
			
			String q2 = "insert into Address values("+addId+",'"+city+"','"+country+"',"+empId1+")";
			try {	
			boolean add = s.execute(q2);
			con.commit();
			}catch(SQLException e1){
				System.out.println("Please enter valid address !!");
				con.rollback();
			}
			break;
		case 3 :
			ResultSet rs = s.executeQuery("select * from Employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDate(4));
			}
			System.out.println("==================");
			rs = s.executeQuery("select * from Address");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			break;
		default :
			System.out.println("Invalid Entry !!!");
			break;
			
		}
		
		con.close();
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}

	}

}
