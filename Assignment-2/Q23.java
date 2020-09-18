import java.util.Scanner;

class Q23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr1[]= new int[5];
		int arr2[]= new int[5];
		System.out.println("Enter the 5 elements :");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		int j=0;
		for(int i=arr1.length-1;i>=0;i--){
			arr2[j++]=arr1[i];
		}
		System.out.println("Reverse array :");
		for(int a:arr2){
			System.out.print(a+" ");
		}
		
	}
}