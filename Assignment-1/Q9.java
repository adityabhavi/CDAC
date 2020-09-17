import java.util.Scanner;

class Q9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age in Days :");
		int age = sc.nextInt();
		int year = age/365;
		age=age%365;
		int month = age / 30;
		int day = age%30;
		System.out.print("Year :"+year+"\nMonth :"+month+"\nDay :"+day);
		
	}
}