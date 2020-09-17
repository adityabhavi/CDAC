import java.util.Scanner;

class Q7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks :");
		int sum=0;
		for(int i=0;i<5;i++){
				int a=sc.nextInt();
				sum=sum+a;
		}
		int per = sum/5;
		System.out.println("Percentage :"+per+" %");
	}
}