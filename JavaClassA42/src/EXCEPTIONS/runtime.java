package EXCEPTIONS;

public class runtime {
	String s2="java";

	public static void main(String[] args) {
		Object obj=new sample();
		try {
	      runtime s1=(runtime) new Object();
			System.out.println(s1.s2);
		}
		catch(RuntimeException e1) {
			System.out.println("Exception hand......");
		}

	}

}
