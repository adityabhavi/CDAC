package Q58;

import java.util.Scanner;

public class Q58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Firday","Saturday"};
		System.out.println("Enter the day number : ");
		int z = sc.nextInt();
		try {
			System.out.println("The day is : "+str[z]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter Valid Value");
		}
	}
}
