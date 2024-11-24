package Number;
import java.util.Scanner;
public class month {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of the Month");
		int no=sc.nextInt();
		switch (no)
		{
		case 1:
		{
			System.out.println("january");
		}break;
		case 2:
		{
			System.out.println("february");
		}break;
		case 3:
		{
			System.out.println("march");
		}break;
		case 4:
		{
			System.out.println("April");
		}break;
		case 5:
		{
			System.out.println("May");
		}break;
		case 6:
		{
			System.out.println("june");
		}break;
		case 7:
		{
			System.out.println("july");
		}break;
		case 8:
		{
			System.out.println("August");
		}break;
		case 9:
		{
			System.out.println("September");
		}break;
		case 10:
		{
			System.out.println("October");
		}break;
		case 11:
		{
			System.out.println("November");
		}break;
		case 12:
		{
			System.out.println("December");
		}break;
		default:
		{
			System.out.println("try again");
		}
		}
	}
	

}
