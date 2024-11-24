package COLLECTIONS;

import java.util.Stack;

public class push_program {

	public static void main(String[] args) {
        Stack a1= new Stack();
		a1.add("TYSS");
		a1.add("Microsoft");
		a1.add("Capgemini");
		a1.add("Oracle");
		a1.add("DXC Technology");
		a1.add("Wipro");
		a1.add("TCS");
		System.out.println(a1.pop());
		System.out.println(a1);
		System.out.println("----------------------");
		System.out.println(a1.peek());
		System.out.println(a1);
		a1.push("Facebook");
		a1.push("Facebook");  
		System.out.println(a1);
	}

}
//hashset,linkedhasset