//28.	Initialize one String type of array and print the elements using for each loop.
import java.util.Scanner;

class Q28{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i=0;i<n;i++){
			str[i] = sc.next();
			//System.out.print(" "+str[i]);
		}
		for(String a:str){
			System.out.print(" "+a);
		}
	}
}