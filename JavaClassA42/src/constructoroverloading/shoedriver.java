package constructoroverloading;

public class shoedriver {

	public static void main(String[] args) {
		shoe s=new shoe();
		shoe s1=new shoe("sneakers");
		System.out.println(s1.name);
		shoe s2=new shoe("sneakers",350.0);
		System.out.println(s2.name);
		System.out.println(s2.price);
		shoe s3=new shoe("sneakers",350.0,7);
		System.out.println(s3.name);
		System.out.println(s3.price);
		System.out.println(s3.size);
		shoe s4=new shoe("sneakers",350.0,7,"green");
		System.out.println(s4.name);
		System.out.println(s4.price);
		System.out.println(s4.size);
		System.out.println(s4.colour);
	}

}
