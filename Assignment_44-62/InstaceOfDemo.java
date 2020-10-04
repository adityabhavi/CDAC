//46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting.



package Q46;

class Foo{
	int a;
	Foo(){}
	public Foo(int a) {
		super();
		this.a = a;
	}
}

class Bar extends Foo {
	Bar(){}
	
	public Bar(int a, int b) {
		super(a);
		this.b = b;
	}

	int b;
}

public class InstaceOfDemo {

	public static void main(String[] args) {
		Foo f = new Bar();
		boolean f1 = f instanceof Foo;
		boolean f2 = f instanceof Bar;
		System.out.println("f1 : "+f1);
		System.out.println("f2 : "+f2);
		
		Bar d = (Bar)f;
		boolean d1 = d instanceof Foo;
		boolean d2 = d instanceof Bar;
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d2);
		
		
		Bar b = new Bar();
		boolean b1 = b instanceof Foo;
		boolean b2 = b instanceof Bar;
		System.out.println("b1 : "+b1);
		System.out.println("b2 : "+b2);
		
		
		Foo z = new Foo();
		boolean z1 = z instanceof Bar;
		boolean z2 = z instanceof Foo;
		System.out.println("z1 : "+z1);
		System.out.println("z2 : "+z2);
	}

}
