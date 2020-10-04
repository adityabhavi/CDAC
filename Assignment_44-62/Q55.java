//55.	Write a program to count no of words in the String.

package Q55;

import java.util.Scanner;

public class Q55 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		String str = "Hello CDAC Mumbai and CDAC Juhu";
		String arr[] = str.split(" ");
		int a = arr.length;
		System.out.println(a);
		
	}

}
