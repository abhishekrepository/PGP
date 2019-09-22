class A {
	int a=10;
	A(){
		System.out.println("A Constructor");
	}
	void display() {
	 System.out.println("Inside class A");
	}
}
class B extends A{
	B(){
		System.out.println("B Constructor");
	}
	@Override
	void display() {
		System.out.println("Inside class B");
		super.display();
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println();
		System.out.println(obj.a);
		obj.display();
	}

}
