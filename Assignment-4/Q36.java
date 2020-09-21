import java.util.Scanner;

class MathOperation {
  

  int multiply(int a, int b) {
        return a * b;
  }

  float multiply(float a,float b, float c){
    return (float)(a*b*c);
  }

  int multiply(int arr[]){
    int mul=1;
    for(int i=0;i<arr.length;i++){
        mul=mul*arr[i];
    }
    return mul;
  }
  
  double multiply(double a, int b, int c){
    return a*b*c;
  }
  
}

class Demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //System.out.print("Enter the two numbers : ");
    //int a = sc.nextInt();
    //int b = sc.nextInt();
    MathOperation m1 = new MathOperation();
    
    System.out.println(
      "Multiplication of two integer numbers is : " + m1.multiply(2,3)
    );

    System.out.println(
      "Multiplication of three float numbers is : " + m1.multiply(2.5f,2.5f,2.5f)
    );

    int arr[]={2,2,2};

    System.out.println(
      "Multiplication of array elements is : " + m1.multiply(arr)
    );

    System.out.println(
      "Multiplication of one double and two integer numbers is : " + m1.multiply(2.5,2,2)
    );

  }
}
