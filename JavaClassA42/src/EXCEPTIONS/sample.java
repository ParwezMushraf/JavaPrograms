package EXCEPTIONS;

public class sample {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try { 
			System.out.println("---------try block start--------");
		int res=a/b;
		System.out.println(res);
		System.out.println("---------try block ends-----------");
		}
		catch(ArithmeticException e1) {
			System.out.println("Exception handeled.......");
		}
		
		}
	}


