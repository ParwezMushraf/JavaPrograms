package EXCEPTIONS;

public class finally_block {

	public static void main(String[] args) {
		int a=12;
		int b=0;
		try {
		int res=a/b;v  b
		System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println();
		}
		finally {
			System.out.println("finally block");
		}
	}

}
