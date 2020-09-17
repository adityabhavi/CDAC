import java.util.Scanner;

class Q15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the gender (m or f):");
		char g = sc.next().charAt(0);
		System.out.print("Enter the age :");
		int age = sc.nextInt();
		if( g=='m' && age>=21){
			System.out.print("Eligible for marriage.");
		}else if ( g=='f' && age>=18 ){
			System.out.print("Eligible for marriage.");
		}else{
			System.out.print("Not eligible for marriage.");
		}
	}
}