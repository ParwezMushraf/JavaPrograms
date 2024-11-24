package nonprimitive_typecasting;

public class pineapple extends fruits {
	String name1="pineapple";
	double price=50;
	
	public void salad() {
		System.out.println("it is used in salad");
	}
	
	public void sour() {
		System.out.println("it is bit sweet and sour");
	}
	
	public static void main(String []args) {
		fruits f=new pineapple();
		System.out.println(f.name);
		System.out.println(f.shape);
		f.juice();
		f.fruit();
		pineapple p=(pineapple)new fruits;
		System.out.println("--------Downcasting-------");
		System.out.println(f.name);
		f.fruit();
		f.juice();
		System.out.println(p.name1);
		System.out.println(p.price);
		p.salad();
		p.sour();
		
		
	}

}
