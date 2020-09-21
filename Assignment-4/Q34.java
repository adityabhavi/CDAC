import java.util.Scanner;

class Circle{
    private int radius;
    private double area;

    void init(int radius){
        this.radius = radius;
    }

    void calculateArea(){
        area = 2 * 3.14 * radius * radius;
    }

    void display(){
        System.out.println("Area of Circle is : "+area);
    }
}

class CircleDemo{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int r = sc.nextInt();
        Circle c1 = new Circle();
        c1.init(r);
        c1.calculateArea();
        c1.display();    
    }
}