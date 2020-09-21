import java.util.Scanner;

class Student{
	
	private int rollno;
	private String sname;
	
	void setData(int rollno,String sname){
		this.rollno=rollno;
		this.sname=sname;
	}
	
	void showData(){
		System.out.println("rollno :"+rollno);
		System.out.println("sname :"+sname);
	}

}
class Q33{
	public static void main(String args[]){
	Student s1 = new Student();
	s1.setData(1,"Aditya");
	s1.showData();
	}
}