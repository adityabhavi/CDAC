import java.util.Scanner;

class Q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if( a > b && a > c ){
			System.out.print("Greatest number is :"+a);
		}else if( b > a && b > c){
			System.out.print("Greatest number is :"+b);
		}else{
			System.out.print("Greatest number is :"+c);
		}
	}
}