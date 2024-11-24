package EXCEPTIONS;

public class multiple_catch {
	String s1="java";

	public static void main(String[] args) {
		Object obj=new sample();
		try {
			multiple_catch s1=(multiple_catch)new Object(); //null;
			System.out.println(s1.s1);
			}
			catch(ClassCastException e1) {
				System.out.println("Classcastexception hand....");
			}
			catch(NullPointerException e1) {
				System.out.println("NullPointerException han....");
			}
	}

}
