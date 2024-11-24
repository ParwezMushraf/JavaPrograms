package COLLECTIONS;
import java.util.ArrayList;
public class program {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList();
		a1.add("Java");
		a1.add("c");
		a1.add("c++");
		a1.add("python");
		a1.add("ruby");
		a1.add("javascript");
		a1.add("php");
		System.out.println(a1.get(0));
		for(int i=0;i<=a1.size()-1;i++) {
			System.out.println(a1.get(i));

	}

}}
