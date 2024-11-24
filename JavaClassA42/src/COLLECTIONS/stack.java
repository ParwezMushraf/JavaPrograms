package COLLECTIONS;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack a1= new Stack();
		
		a1.add("Sandwich");
		a1.add("Mutton Korma");
		a1.add("Fish Makhani");
		a1.add("Pulihora");
		a1.add("Fish Biryani");
		a1.add("Butter Chicken");
		a1.add("Dum Biryani");
		System.out.println(a1);
		System.out.println(a1.pop());
		System.out.println(a1);
		System.out.println("----------------------");
		System.out.println(a1.peek());
		System.out.println(a1);
        
	}

}
