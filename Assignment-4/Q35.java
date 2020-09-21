import java.util.Scanner;

class MathOperation {
  private int a;
  private int b;

  int add(int a, int b) {
    this.a = a;
    this.b = b;
    return a + b;
  }

  int subtract(int a, int b) {
    this.a = a;
    this.b = b;
    return a - b;
  }

  int multiply(int a, int b) {
    this.a = a;
    this.b = b;
    return a * b;
  }

  int power(int a, int b) {
    this.a = a;
    this.b = b;
    int p = a;
    for (int i = 1; i <= b - 1; i++) {
      p = p * a;
    }
    return p;
  }
}

class Demo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the two numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    MathOperation m1 = new MathOperation();
    System.out.println("Addition of two numbers is : " + m1.add(a, b));
    System.out.println(
      "Substaraction of two numbers is : " + m1.subtract(a, b)
    );
    System.out.println(
      "Multiplication of two numbers is : " + m1.multiply(a, b)
    );
    System.out.println("Power of two numbers is : " + m1.power(a, b));
  }
}
