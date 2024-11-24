package EXCEPTIONS;
import java.util.Scanner;

public class customized_Exception extends RuntimeException {
	
		public String getMesssage() {
			return "you are not eligible for marriage";
		}

		public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the age");
	    int age=sc.nextInt();
	    if(age>=21)
	System.out.println("Happy Marriage Life");
	    else
	    	try {
	    	throw new customized_Exception();
	    	}
	    catch(customized_Exception c) {
	    	System.out.println(c.getMesssage());
	    }
		}	
		}


