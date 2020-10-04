//54.	Write a program to reverse the given String.

package Q54;

import java.util.Scanner;

public class Q54 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s=sc.next();
		StringBuilder str = new StringBuilder(s);
		System.out.println(str);
		str.reverse();
		System.out.println(str);
	}
}
