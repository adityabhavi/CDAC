import java.util.Scanner;
//21.	Program to show sum and average of 10 element array. Accept array elements from user. 
class Q21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 elements :");
		int sum=0;
		for(int i=0;i<10;i++){
			arr[i] = sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum is :"+sum);
		float avg=sum/10F;
		System.out.println("Sum is :"+avg);
	}
}