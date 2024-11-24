package Inhertance;

public class maruthi800 extends car{
	String model="maruthi800";
	double price=900000;

	public static void main(String[] args) {
		maruthi800 m=new maruthi800();
		System.out.println(m.type);
		System.out.println(m.name);
		race();
		tour();
		System.out.println(m.price);
		System.out.println(m.no_plate);
		System.out.println(m.colour);
		seats();
		wheels();
		System.out.println(m.price);
		System.out.println(m.model);

	}

}
