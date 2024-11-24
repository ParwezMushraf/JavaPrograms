package string_programs;

public class String_to_char {

	public static void main(String[] args) {
		String s1="Qspiders KPHB";
		System.out.println(s1.indexOf(' '));
		char ch[]=s1.toCharArray();
		for(char ch1:ch) {
			System.out.println(ch1);
			
			System.out.println(s1.isBlank());
			System.out.println(s1.isEmpty());
		}

	}

}

