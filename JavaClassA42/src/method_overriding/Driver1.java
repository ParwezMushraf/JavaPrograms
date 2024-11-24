package method_overriding;

public class Driver1 {

	public static void main(String[] args) {
		cat c=new cat();
		c.sound();
		c.eat();
		dog d=new dog();
		d.sound();
		d.eat();
		snake s=new snake();
		s.sound();
		s.eat();
		

	}

}

