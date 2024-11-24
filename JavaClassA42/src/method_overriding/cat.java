package method_overriding;

public class cat extends animal{
	public void sound() {
		super.sound();
		System.out.println("meow");
	
	}

	public void eat() {
		super.eat();
		System.out.println("cat eats fish and rat");
		
	}
}
