package hirarical_Inhertance;

public class cat extends animal {
	String Name="billi";
	String Breed="siamese";
	double price=20000;
	
	public static void drink() {
		System.out.println("Drinks milk");
	}

	public static void main(String[] args) {
		cat c=new cat();
		System.out.println(c.name);
		System.out.println(c.type);
		c.Animal();
		System.out.println(c.Name);
        System.out.println(c.Breed);
        System.out.println(c.price);
        c.drink();

		

	}

}
