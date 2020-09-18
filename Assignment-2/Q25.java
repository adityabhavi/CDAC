import java.util.Scanner;

class Q25{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr1[]= new int[6];
		System.out.println("Enter the 6 elements :");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		int even=0,odd=0;
		
		for(int a:arr1){
			if(a%2==0){
				even=even+a;
			}else{
				odd=odd+a;
			}
		}
		
		System.out.println("Sum of even elements :"+even);
		System.out.println("Sum of odd elements :"+odd);
		
	}
}