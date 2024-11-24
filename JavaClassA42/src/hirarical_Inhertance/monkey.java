package hirarical_Inhertance;

public class monkey extends animal {
	String name1="monkey";
	String Breed1="rhesus";
	
	
	public static void eat() {
		System.out.println("eat bananas");
	}

	public static void main(String[] args) {
	monkey m=new monkey();
	    System.out.println(m.name);
		System.out.println(m.type);
		m.Animal();
		System.out.println(m.name1);
        System.out.println(m.Breed1);
        m.eat(); 

	}

}
