import java.util.Scanner;
class Q29{
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter no.of rows");
				int rows = sc.nextInt();
				int arr[][] = new int [rows][];
				int sum=0;
				
				int a[]=new int [4];
				int b[] = new int[4];
				int c[]=new int [3];
				int d[] = new int[3];
				int e[]=new int [3];
				
				arr[0]=a;
				arr[1]=b;
				arr[2]=c;
				arr[3]=d;			
				arr[4]=e;
				int cnt=0;
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[i].length;j++)
					{
						System.out.print("Enter the number for "+i+" "+j+" :");
						arr[i][j]=sc.nextInt();
					}
				}
				System.out.print("Arr one-D arrays : ");
				for(int i=0;i<arr.length;i++)
				{
					cnt++;
					System.out.print(" "+arr[i]);
				}
				System.out.println("");
				System.out.println("Total numbner of one-D array in two-D array : "+cnt);
				for(int i=0;i<arr.length;i++)
				{
					cnt=0;
					System.out.print("Elements of a["+i+"] are :");
					for(int j=0;j<arr[i].length;j++)
					{
							cnt++;
							System.out.print(" "+arr[i][j]);
					}
					System.out.println(" ");
					System.out.println("Total number of elements in a["+i+"] are : "+cnt);
					
					
				}
			}
}

