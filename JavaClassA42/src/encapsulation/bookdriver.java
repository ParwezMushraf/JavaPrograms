package encapsulation;

public class bookdriver {

	public static void main(String[] args) {
		book b1=new book("java");
		System.out.println(b1.getname());
		b1.setname("sql");
		System.out.println(b1.getname());
		   
	}

}
