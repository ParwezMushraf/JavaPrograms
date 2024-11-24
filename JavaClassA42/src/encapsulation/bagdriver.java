package encapsulation;

public class bagdriver {

	public static void main(String[] args) {
		bag b=new bag("college bag",2000,"skybags","blue","waterproof");
		System.out.println(b.getname());
		System.out.println(b.getprice());
		System.out.println(b.getbrand());
		System.out.println(b.getcolour());
		System.out.println(b.gettype());
		System.out.println("-------------------");
		b.setprice(600);
		System.out.println(b.getprice());
	}

}
