package map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class entry_map {

	public static void main(String[] args) {
	  TreeMap tm=new TreeMap();
	  tm.put("Java", 96);
	  tm.put("Sql", 30);
	  tm.put("manual", 60);
	  tm.put("Api", 30);
	  tm.put("Automation", 50);
	  System.out.println(tm);
	  Set s1=tm.entrySet();
	  Iterator i=s1.iterator();
	  while(i.hasNext()) {
		  System.out.println(i.next());
	  }

	}

}
