package map;

import java.util.HashMap;
public class hashmap {

	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(12, "Madhuri");
		h1.put(13, "Hema");
		h1.put(12, "parvez");
		h1.put(18, "Rama");
		h1.put(null, "Ali");
		h1.put(null, "Madhu");
		System.out.println(h1);
		HashMap h2=new HashMap();
		h2.putAll(h1);
		System.out.println(h2);

	}

}
