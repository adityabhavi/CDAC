//48.	Create an Abstract class Processor with int member variable data  and method showData to 
//display data value. Create abstract method process() to define processing of member data. 
//Create a class  Factorial using abstract class Processor  to calculate and print factorial 
//of a number by overriding the process method. b. Create a class Circle using abstract class 
//Processor to calculate and print area of a circle by overriding the process method.Ask user 
//to enter choice (factorial or circle area).  Also ask data to work upon. Use Processor class 
//reference to achieve this mechanism.


package Q48;

import java.util.Scanner;

abstract class Processor{
	int data;
	abstract void process(int data);
	void show() {
		System.out.println("Entered Data is : "+data);
	}
}

class Factorial extends Processor{
	
	@Override
	void process(int data) {
		int fact=1;
		while(data>=1) {
			fact=fact*data;
			data=data-1;
		}
		
		System.out.println("Factorial of "+data+" is :"+fact);
	}
	
}

class Circle extends Processor{

	@Override
	void process(int data) {
		double area = (3.14 * data * data) ;
		System.out.println("Area of Circle is : "+area);
	}
	
}



public class Q48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Processor f = new Factorial();
		Processor c= new Circle();
		int data;
		System.out.println("Select the operations :");
		System.out.println("For Factorial : F");
		System.out.println("For Circle: C");
		char a = sc.next().charAt(0);
		switch (a) {
		case 'F': System.out.print("Enter the number :");
				data=sc.nextInt();
				f.show();
				f.process(data);
				break;
		case 'C': System.out.print("Enter the radius :");
				data=sc.nextInt();
				c.show();
				c.process(data);
				break;
		default:System.out.println("Please Enter the valid operation...");
		}
	}

}
