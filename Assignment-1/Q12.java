import java.util.Scanner;

class Q12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary :");
		int bs = sc.nextInt();
		if(bs<10000){
			double hra = 0.1 * bs; //500
			double da = 0.9 * bs; //4500
			double gs = bs + hra + da ;
			System.out.print("Gross Salary :"+gs);
		}else if(bs>=10000){
			double hra=2000;
			double da = 0.98 * bs;
			double gs = bs + hra + da ;
			System.out.print("Gross Salary is:"+gs);
		}
		
	}
}