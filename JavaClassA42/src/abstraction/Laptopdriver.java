package abstraction;

public class Laptopdriver extends Laptop{
	     public interface Father {

	}

		int ali;
	     
	Laptopdriver(String name,double price,int ali){
	   super(name,price);
	   this.ali=ali;
	}
	public void demo() {
		System.out.println("demo method");
	}
	
	public static void main(String[] args) {
		Laptopdriver l=new Laptopdriver("ali",45000,45);
		System.out.println(l.name);
		System.out.println(l.price);
		System.out.println(l.ali);
		System.out.println(l.col);
		l.play();
		l.watch();
//		l.demo();
	}

}
