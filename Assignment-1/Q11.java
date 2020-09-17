import java.util.Scanner;

class Q11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number  :");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number  :");
		int b = sc.nextInt();
		System.out.println("Before Swapping a :"+a+" and b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a :"+a+" and b:"+b);
		
	}
}