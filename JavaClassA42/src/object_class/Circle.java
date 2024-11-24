package object_class;

public class Circle {
	
	int rad;
	
	public Circle(int rad) {
		this.rad=rad;
	}
	
	public String toString() {
		return rad+"";
	}
	
	public static void main(String[] args) {
		Circle c1 =new Circle(10);
		System.out.println(c1);
		System.out.println(c1.toString());

	}

}
