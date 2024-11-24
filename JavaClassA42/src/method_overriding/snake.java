package method_overriding;

public class snake extends animal{
	public void sound() {
		super.sound();
		System.out.println("hissss");
	}
	
      public void eat() {
    	  super.eat();
    	  System.out.println("snake eats mongoose");
    	  
      }
}
