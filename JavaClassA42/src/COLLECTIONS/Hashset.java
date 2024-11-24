package COLLECTIONS;
import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add("Red");
	h1.add("Blue");
	h1.add("pink");
	h1.add("Green");
	h1.add("yellow");
	h1.add("violet");
	h1.add("maroon");
	h1.add(null);
	h1.add(null);
	h1.add(123);
	
	System.out.println(h1);	
	for(Object obj:h1) {
		System.out.println(obj);
	}
	

	}

}
