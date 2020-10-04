package Q47;

class Foo{
	int a;
	Foo(){
		System.out.println("Non-Para A");
	}
	public Foo(int a) {
		super();
		this.a = a;
		System.out.println("Para A");
	}
	
}

class Bar extends Foo{
	int b;
	Bar(){
		System.out.println("Non-Para B");
	}

	public Bar(int a, int b) {
		super(a);
		this.b = b;
		
	}
	
	
}
public class ConstChaining {

	public static void main(String[] args) {
		Foo f1 = new Foo();
		Foo f2 = new Foo(10);
		Bar b1 = new Bar();
		Bar b2 = new Bar(10,10);
		
		
	}

}
