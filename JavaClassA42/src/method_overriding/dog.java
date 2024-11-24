package method_overriding;

public class dog extends animal {

	public void sound() {
		super.sound();
		System.out.println("bow");
	
	}
	
	public void eat() {
		super.eat();
		System.out.println("dog eats chicken and mutton");
	}
}
