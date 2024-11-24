package map;
import java.util.TreeMap;

public class tree {

	public static void main(String[] args) {
		TreeMap<String, Integer> t1= new TreeMap();
		t1.put("Dewars 18", 8000);
		t1.put("Black Dog Reserve", 7500);
		t1.put("Dewars 18", 8000);
		t1.put("Ali",null);
		t1.put("Jack Daniels", 5000);
		t1.put("Blenders pride", 3000);
		t1.put("Royal Challenge", 2500);
		System.out.println(t1);
	}

}
