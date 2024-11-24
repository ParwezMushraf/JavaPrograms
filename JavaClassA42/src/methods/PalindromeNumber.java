package methods;
import java.util.Scanner;

public class PalindromeNumber
{
		public static int reverseNumber(int no) 
		{
			int rev=0;
			while(no>0) 
			{
				int rem=no%10;
				rev=(rev*10)+rem;
				no=no/10;	
			}
			return rev;
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int no=sc.nextInt();
			if(no==reverseNumber(no))
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
			}
		}
}

