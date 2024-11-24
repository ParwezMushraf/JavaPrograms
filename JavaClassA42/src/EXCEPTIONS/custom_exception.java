package EXCEPTIONS;
import java.util.Scanner;

public class custom_exception extends RuntimeException {

		public static void main(String[] args) throws custom_exception {
			Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=sc.nextInt();
	if(age>=21)
		System.out.println("Happy Marriage life");
	else {
		throw new custom_exception();
		}
	}
	}


