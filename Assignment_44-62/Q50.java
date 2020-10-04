//50.	Explain the importance of toString() and equals() method of the Object class and override them on class 
//Employee(empId,name,salary).  a. Create class for main method(say XYZ),and accept five employees information and 
//store in an array. Also ensure if entered empId already exist or not (use equals method).  
//b. Display all employee info using toString method.

package Q50;

import java.util.Scanner;

class Employee {
	//int empId;
	String name;
	int salary;
	public int empId;
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return empId + " " + name + " " + salary ;
	}
	
	@Override
	public boolean 	equals(Object obj) {
			if(obj == null)
				return false;
			if(obj instanceof Employee) {
				Employee emp = (Employee)obj;
				if( empId == emp.empId) {
					System.out.println("empId is already exists.");
					return true;
				}
			}
			return false;
	}
	
	
	
}

public class Q50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee arr[]=new Employee[2];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the empId :");
			int a=sc.nextInt();
			System.out.print("Enter the name :");
			String n=sc.next();
			System.out.print("Enter the salary :");
			int s=sc.nextInt();
			arr[i]=	new Employee(a,n,s);
			for(int j=0;j<i;j++) {
				if(arr[i].equals(arr[j])) {
					i--;
					break;
				}
			}
		}

		for(Employee e:arr) {
			System.out.println(e);
		}
		
	}

}
