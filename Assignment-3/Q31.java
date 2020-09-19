import java.util.Scanner;

class Student{
	
	private int rno;
	private String name;
	
	void setData(int rollno,String sname){
		rno=rollno;
		name=sname;
	}
	
	void showData(){
		System.out.println("rno :"+rno);
		System.out.println("name :"+name);
	}

}

class Q31{
	public static void main(String args[]){
	Student s1 = new Student();
	s1.setData(1,"Aditya");
	s1.showData();
	}
}