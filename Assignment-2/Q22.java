import java.util.Scanner;
//22.	Sort a ten element array in descending order.
class Q22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
//		int arr1[] = new int[5];
		System.out.println("Enter 10 elements :");
		for(int i=0;i<10;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] < arr[j] ){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
}