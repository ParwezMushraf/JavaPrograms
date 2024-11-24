package string_programs;

public class palindrome {

	public static void main(String[] args) {
		String s1="madam";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		if(s1.equals(s2)) {
			System.out.println("palindrome string :"+s1);
		}
		else {
			
		System.out.println("not a palindrome string :"+s1);
		}

	}

	}


