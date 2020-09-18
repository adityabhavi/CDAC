import java.util.Scanner;
//20.	Print all prime numbers between two given numbers. [ break continue ]
class Q20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter a last number:");
		int num2 = sc.nextInt();
		int flag;
		System.out.print("Prime Numbers between "+num1+" to "+num2+" are :");
		for(int i=num1;i<=num2;i++){
			flag=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
					System.out.print(i+" ");
					continue;
			}
		}
	}
}