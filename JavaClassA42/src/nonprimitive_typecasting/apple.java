package nonprimitive_typecasting;

public class apple extends fruit{
	String col1="red";
	double price=45;
	
	public void sweet() {
		System.out.println("it is sweet in taste");
	}

	public void juice() {
		System.out.println("we can prepare juice with apple");
	}
	public static void main(String[] args) {
		//System.out.println(fruit.col);
		//fruit.fruit();
		fruit f=new apple();
		System.out.println(f.col);
		System.out.println(f.shape);
		f.fruit(); 
		f.Apple();
	}

}
