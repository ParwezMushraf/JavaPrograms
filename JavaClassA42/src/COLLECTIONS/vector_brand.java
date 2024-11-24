package COLLECTIONS;

import java.util.Vector;

public class vector_brand {

	public static void main(String[] args) {
		Vector V1=new Vector();
		V1.add("100 pipers");
		V1.add("mansionhouse");
		V1.add("MM");
		V1.add(null);
		V1.add("blender sprite");
		Vector V2=new Vector();
		V2.add("Teachers");
		V2.add("signatures");
		V2.add("Royal Green");
		V1.add(V2);
		System.out.println(V1);
		V1.remove(V2);
		System.out.println(V1);
		V1.addAll(V2);
		System.out.println(V1);
		V1.removeAll(V2);
		System.out.println(V1);
		System.out.println(V1.contains("MM"));
		V1.clear();
		System.out.println(V1);
		for(int i=0;i<=V1.size()-1;i++) {
			System.out.println(V1.get(i));
		
		

	}

	}}
	
