package COLLECTIONS;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector V1=new Vector();
		V1.add("csk");
		V1.add("MI");
		V1.add("DC");
		V1.add("SRH");
		V1.add(null);
		V1.add("KKR");
		V1.add("RR");
		System.out.println(V1.size());
		for(int i=0;i<=V1.size()-1;i++) {
			System.out.println(V1.get(i));
		}
		
		
		
		

	}

}
