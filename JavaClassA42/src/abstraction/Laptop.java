package abstraction;

public class Laptop {
	
	String name;//non static variable
	double price;
	static String col="black";
	
	Laptop(String name,double price){//constructor
		this.name=name;
		this.price=price;
	}
	
	public void play() {
		System.out.println("playing games");
	}
	
	public static void watch() {
		System.out.println("watching java classes");
	}
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println(" non static block");
	}

}
