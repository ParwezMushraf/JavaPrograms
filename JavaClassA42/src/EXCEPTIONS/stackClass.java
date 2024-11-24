package EXCEPTIONS;

public class stackClass {
	
	{
	try{
		stackClass s1=new stackClass();
	}
	catch(StackOverflowError e) {
		System.out.println("stackoverflowError is handled");
		}
	}

	public static void main(String[] args) {
		stackClass s1=new stackClass();
		
		}
}


