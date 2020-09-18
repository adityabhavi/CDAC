import java.util.Scanner;

class Q24{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr1[]= new int[5];
		System.out.println("Enter the 5 elements :");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter the element to be search : ");
		int s=sc.nextInt();
		int flag=0;
		for(int a:arr1){
			if(a==s){
				System.out.println(a+" is present in the array.");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println(s+" is NOT present in the array.");
		}
	}
}