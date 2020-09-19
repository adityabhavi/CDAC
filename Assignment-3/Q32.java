import java.util.Scanner;

class Student{
	
	private int rno;
	private String name;
	private static int count=0;
	void setData(int rollno,String sname){
		rno=rollno;
		name=sname;
		count++;
	}
	
	void showData(){
		System.out.println("rno :"+rno);
		System.out.println("name :"+name);
		System.out.println("no :"+count);
	}

}

class Q32{
	public static void main(String args[]){
	Student s1 = new Student();
	s1.setData(1,"Aditya");
	s1.showData();
	Student s2 = new Student();
	s2.setData(2,"Aaditya");
	s2.showData();
	}
}