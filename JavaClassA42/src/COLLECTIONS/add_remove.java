package COLLECTIONS;

import java.util.ArrayList;

public class add_remove {

	public static void main(String[] args) {
		ArrayList ld = new ArrayList();
		ld.add("cocacola");
		ld.add("maaza");
		ld.add("sprite");
		ld.add("Thumpsup");
		ld.add("fanta");
		ArrayList ft = new ArrayList();
		ft.add("Apple");
		ft.add("grapes");
		ft.add("mango");
		ft.add("banana");
		ft.add("watermelon");
		ft.add(ld);
		System.out.println(ft);
		System.out.println("----------------------");
		ft.remove(ld);
		System.out.println(ft);
		System.out.println("----------------------");
		ft.addAll(ld);
		System.out.println(ft);
		System.out.println("----------------------");
		ft.removeAll(ld);
		System.out.println(ft);
		
	}

}
