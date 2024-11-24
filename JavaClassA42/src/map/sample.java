package map;

import java.util.TreeMap;

public class sample {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		  tm.put("Java", 96);
		  tm.put("Sql", 30);
		  tm.put("manual", 60);
		  tm.put("Api", 30);
		  tm.put("Automation", 50);
		  System.out.println(tm);
		  System.out.println(tm.remove("Api"));
		  System.out.println(tm);
		  System.out.println(tm.remove("Sql"));
		  System.out.println(tm);
	}

}
