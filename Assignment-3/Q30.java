import java.util.Scanner;
	
class Q30{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the Elements to :"+i);
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
				if((i+j)%2==0){
					sum=sum+arr[i][j];
				}
			}
		}
		for(int a[]:arr){
			System.out.print("Elemnets of array :");
			for(int b:a){
					System.out.print(" "+b);
			}
			System.out.println("");
		}
		System.out.println("Sum is :"+sum);		
	}	
}	

//01 02 03
//10 20 10

//11 12 13
//20 10 20

//21 22 23
//10 20 10

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	