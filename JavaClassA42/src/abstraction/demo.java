package abstraction;

public class demo extends sample{
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		demo d= new demo();
		d.add(1, 2);
	  
	}

}
