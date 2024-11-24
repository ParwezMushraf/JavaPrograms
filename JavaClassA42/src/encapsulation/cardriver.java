package encapsulation;

public class cardriver {

	public static void main(String[] args) {
	umlcar c1=new umlcar("red",1200000,"benz","xyz");
	    System.out.println(c1.getcolour());
        System.out.println(c1.getprice());
        System.out.println(c1.getbrand());
        System.out.println(c1.getmodel());
        
        umlcar c2=new umlcar("red",1400000,"Maruthi","maruthi800");
	    System.out.println(c2.getcolour());
        System.out.println(c2.getprice());
        System.out.println(c2.getbrand());
        System.out.println(c2.getmodel());

	}

}
