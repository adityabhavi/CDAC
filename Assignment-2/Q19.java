import java.util.Scanner;

class Q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a last number:");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			sum=sum+(i*i);
		}
		System.out.println("Addition of number is :"+sum);
		
	}
}