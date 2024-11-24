package nonprimitive_typecasting;

public class B extends A {
	double d1=123.123;
	public void m1() {
		System.out.println("B class method");
	}

	public static void main(String[] args) {
		A a1=(A)new B();//upcasting
		System.out.println(a1.col); 
		a1.demo();
		System.out.println("----------Downcasting--------");
		B b1=(B)a1;//downcasting
		System.out.println(b1.col);
		b1.demo();
		System.out.println(b1.d1);
		b1.m1();

	}

}
