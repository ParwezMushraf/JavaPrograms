package string_programs;

public class small_string {

	public static void main(String[] args) {
		String s1="MaNiKaNTa";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
		if(s1.charAt(i)>='a'&& s1.charAt(i)<='z') {
			s2=s2+s1.charAt(i);
		}
	}
		System.out.println(s2);
	}
}
