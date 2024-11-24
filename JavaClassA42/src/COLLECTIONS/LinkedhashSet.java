package COLLECTIONS;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSet {

	public static void main(String[] args) {
	LinkedHashSet<String> s1=new LinkedHashSet();
	s1.add("Ertiga");
	s1.add("RR");
	s1.add("innova");
	s1.add("maruthi suzuki");
	s1.add("maruthi 800");
	s1.add("benz");
	s1.add("Baleno");
	 Iterator<String> i=s1.iterator();
	 while(i.hashNext()) {
		 System.out.println(i.next());
	 }

	}

}
