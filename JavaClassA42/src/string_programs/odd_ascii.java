package string_programs;

public class odd_ascii {

	public static void main(String[] args) {
		String s1="AhamadAli";
		 
		for(int i=0;i<=s1.length()-1;i++) { 
			int a=s1.charAt(i);
			if( a%2!=0 ) {
				System.out.println("even "+s1.codePointAt(i));
			}
		}

	}

}
