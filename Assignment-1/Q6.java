import java.util.Scanner;

class Q6 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float pi = 3.14F;
		System.out.print("Enter the radius :");
		int r=sc.nextInt();
		double a,p;
		a = pi * r * r;
		p = 2 * pi * r;
		System.out.println("Area of circle :"+a);
		System.out.println("Perimeter of circle :"+p);
	}
}