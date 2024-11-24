package string_programs;

public class Capital_in_String {

	public static void main(String[] args) {
		String s1="MaNiKaNTa";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
		if(s1.charAt(i)>='A'&& s1.charAt(i)<='Z') {
			s2=s2+s1.charAt(i);
		}
	}
		System.out.println(s2);
		}

}
