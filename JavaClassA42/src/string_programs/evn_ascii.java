package string_programs;

public class evn_ascii {

	public static void main(String[] args) {
		String s1="AhamadAli";
		//String s2="";
		for(char i=0;i<=s1.length()-1;i++) {
			char a=s1.charAt(i);
			System.out.println(a);
			if( a%2==0 ) {
				//System.out.println("even "+s1.codePointAt(i));
			}
		}

	}

}
