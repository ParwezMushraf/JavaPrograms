package methods;
import java.util.Scanner;

public class Palindrome1_100 
{
	public static int reverseNumber(int no)
	{
		int rev=0;
		while(no>0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start number");
		int st=sc.nextInt();
		System.out.println("enter the end number");
		int ed=sc.nextInt();
		for(int i=st;i<=ed;i++)
		{
		int no=i;
		if(no==reverseNumber(no)) 
		{
			System.out.println("palindrome number"+no);
		}	
		}
}
}
