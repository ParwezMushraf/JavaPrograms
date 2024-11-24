package string_programs;

public class lwr_up_spl_dig {

	public static void main(String[] args) {
		String s1="AhA#$ad12LI";
		int uppercount=0;
		int lowercount=0;
		int digitcount=0;
		int splcharcount=0;
		for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
			if(ch>='A'&& ch<='Z') {
				uppercount++;
			}
			else if(ch>='a'&& ch<='z') {
				lowercount++;
			}
			else if(ch>='0' && ch<='9') {
				digitcount++;
			}
			else {
				splcharcount++;
			}
		
		}
		System.out.println(uppercount +" uppercase");
		System.out.println(lowercount+" lowercase");
		System.out.println(digitcount+" digits");
		System.out.println(splcharcount+" special char");

	}

}
