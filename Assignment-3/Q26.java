//26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.
import java.util.Scanner;

class Q26{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the number of subarray : ");
		//int n = sc.nextInt();
		int arr[][] = new int[5][];
		for(int i=0;i<5;i++){
			System.out.print("Enter the 1-d array size for "+i+" : ");
			int s = sc.nextInt();
			arr[i]=new int[s];
			for(int j=0;j<s;j++){
			System.out.println("Enter the elements : arr["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" "+arr[i][j]);
				sum += arr[i][j];
			}
			System.out.println("");
		}
		System.out.println("Sum of all elements : "+sum);
	}
}

//arr[][]=[5][]

//a[]=size[3]
//b[]=size[5]
//c[]=size[6]