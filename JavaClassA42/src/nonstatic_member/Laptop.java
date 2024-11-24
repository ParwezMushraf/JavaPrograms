package nonstatic_member;

public class Laptop {
	String name="HP";
	double price=35000;
	
	public void play() {
		System.out.println(name);
		System.out.println("playing games");
	}
	public void watch()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println("watching movies");
	}
	public static void main(String [] args)
	{
		Laptop L1=new Laptop();
		System.out.println(L1.name);
		System.out.println(L1.price);
		L1.play();
		L1.watch();		
	}

}
