import java.util.Scanner;

class Q8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Pricipal Ammount :");
		int p = sc.nextInt();
		System.out.print("Enter the time :");
		int t = sc.nextInt();
		System.out.print("Enter the rate :");
		int r = sc.nextInt();
		double i = (p * t * r)/100 ;
		double a = i+p;
		System.out.print("Final Ammount :"+a);
		
	}
}