package hashcode;

public class objectclass {

	public static void main(String[] args) {
		objectclass c1=new objectclass();
		System.out.println(c1);
		System.out.println(c1.hashCode());
		sample s1= new sample();
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(c1.hashCode()==s1.hashCode());
		

	}

}
