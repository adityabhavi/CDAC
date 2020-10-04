//56.	Write a program to convert very first character of every word in uppercase in a String.

package Q56;

public class Q56 {

	public static void main(String[] args) {
		String str = "hello cdac mumbai and cdac juhu";
		String s[]=str.split(" ");
		for(String a : s) {
			char c  = a.charAt(0);
			int i = (int)c;
			if(i > 96) {
				i=i-32;
			}
			c=(char)i;
			a=c+a.substring(1);
			System.out.print(a+" ");
		}
	}

}
