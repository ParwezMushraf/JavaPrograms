package EXCEPTIONS;
import java.util.Scanner;

public class voters_Exception extends RuntimeException {
	
	public String getMessage() {
		return "Not elgible for voting";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age"); 
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Elgibile for voting");
		}
		else {
			try {
				throw new voters_Exception();
			}
			catch(voters_Exception v){
				System.out.println(v.getMessage());
			}
		}

	}

}
