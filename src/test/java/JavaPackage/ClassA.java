package JavaPackage;

public class ClassA  {
		//	multiple inheritence 
	ClassB b1 = new ClassB();
	ClassC c1 = new ClassC();
	ClassD d1 = new ClassD();
	/*public void b() {
		b1.b();
	}
*/	public void c() {
		c1.c();
	}
	
	public void d() {
		d1.d();
	}
	
	public void a() {
		System.out.println("This is from class A");
	}
	
	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		ClassB b1 = new ClassB(); // *******another easy way
		a1.a();
		b1.b();	// *******another easy way
		a1.c();
		a1.d();
	}
}
