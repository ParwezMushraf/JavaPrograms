package COLLECTIONS;
import java.util.ArrayList;

public class add_addall_remove_removeall {

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
		ld.add(ft);
		System.out.println(ld);
		System.out.println("----------------------");
		ld.remove(ft);
		System.out.println(ld);
		System.out.println("----------------------");
		ld.addAll(ft);
		System.out.println(ld);
		System.out.println("----------------------");
		ld.removeAll(ft);
		System.out.println(ld);
		
		
		
		

	}

}
