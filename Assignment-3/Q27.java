//27.	Write a program to fine the smallest and greatest number present in the array of integer type.
import java.util.Scanner;

class Q27{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int max=0;
		int min=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				
				if( arr[j] < arr[i] ){
					min = arr[j];
				}
				
				if( arr[j] > arr[i] ){
					max = arr[j];
				}
				
			}
		}
		System.out.println("Max element is : "+max);
		System.out.println("Min element is : "+min);
	}
}