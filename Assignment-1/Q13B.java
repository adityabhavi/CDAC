import java.util.Scanner;

class Q13B{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String str = ( a > b && a > c) ? "Greatest Number :"+a : ( b > a && b > c) ? "Greatest Number :"+b : "Greatest Number :"+c;
		System.out.print(str);
	}
}