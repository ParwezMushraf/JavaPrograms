package hirarical_Inhertance;

public class dog extends animal{
	String sound="bow";
	String breed="bull_dog";
	
	public static void smell() {
		System.out.println("dogs smell everything");
	}

	public static void main(String[] args) {
		dog d=new dog();
		System.out.println(d.name);
		System.out.println(d.type);
		d.Animal();
		System.out.println(d.sound);
        System.out.println(d.breed);
        d.smell();
	}

}
