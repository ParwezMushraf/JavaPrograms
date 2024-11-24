package COLLECTIONS;

import java.util.LinkedHashSet;

public class remove_duplicates {

	public static void main(String[] args) {
		String s1= "Pushpa Raj Nee Yevva Thaggedele..";
		LinkedHashSet<String> l1=new LinkedHashSet();
		
				for( int i=0;i<=s1.length()-1;i++) {
				if(s1.charAt(i)!=' ') {
					l1.add(s1.charAt(i));
				}
		}
				System.out.println(l1);

	}

}
