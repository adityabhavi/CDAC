import java.util.Scanner;

class Q10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Fahrenheit  :");
		int f = sc.nextInt();
		double C= 5*(f-32)/9;
		System.out.print("Celsius :"+C);
		
	}
}