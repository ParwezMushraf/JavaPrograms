package EXCEPTIONS;

public class Stringexception {

	public static void main(String[] args) {
		String s ="Ahamad";
		for(int i=0;i<=s.length();i++) {
		try { 
		System.out.println(s.charAt(i));
		}
		
		catch(StringIndexOutOfBoundsException S) {
			System.out.println("Exception handeled.......");
		}
		
		}
	}

}
