package COLLECTIONS;

import java.util.ArrayList;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Shahrukh Khan");
		a1.add("Allu Arjun");
		a1.add("Prabhas");
		a1.add("Salman Khan");
		a1.add("Ram");
		Iterator i=a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
