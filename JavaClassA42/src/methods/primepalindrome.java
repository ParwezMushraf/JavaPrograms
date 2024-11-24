 package methods;
import java.util.Scanner;

public class primepalindrome 
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
		{/*
		//	System.out.println("palindrome number"+no);
		}	
		}
		for(int i=st;i<=ed;i++)
		{
		int no=i;*/
		{
		boolean flag=true;
		for(int j=2;j<no;j++)
		{
		if(no%j==0)
		{
		flag=false;
		break;
		}
		}
		if(flag==true)
		{
	
			System.out.println("prime number"+no);
		}
		}
		}
	}
	}
}