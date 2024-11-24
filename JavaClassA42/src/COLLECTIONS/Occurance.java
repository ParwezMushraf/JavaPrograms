package COLLECTIONS;
import java.util.LinkedHashSet;

public class Occurance {

	public static void main(String[] args) {
		String s1="Iam a good boy";
		LinkedHashSet<Character> s=new LinkedHashSet();
		for(int i=0;i<=s1.length()-1;i++){
			if(s1.charAt(i)!=' ') {
				s.add(s1.charAt(i));
			}
		}
		System.out.println("-----------");
		for(Character ch:s) {
			char ch1=ch;
			int count=0;
			for(int i=0;i<=s1.length()-1;i++) {
				if(s1.charAt(i)==ch1) {
					count++;
				}
			}
			System.out.println(ch+"-> "+count);
		}

	}

}
