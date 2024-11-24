package COLLECTIONS;

import java.util.TreeSet;

public class program_TreeSet {

	public static void main(String[] args) {
		TreeSet s1=new TreeSet();
       for(char ch='z';ch>='A';ch--) {
    	   s1.add(ch);
       }
       System.out.println(s1);
	}

}
