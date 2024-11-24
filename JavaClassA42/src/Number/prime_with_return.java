package Number;
import java.util.Scanner;

public class prime_with_return {
	public static int prime(int no) {
		int count=0;
				for(int i=1;i<=no;i++) {
					if(no%i==0) {
						count++;
					}
					}
	    return count;
	}

	public static void main(String[] args)
	{
		prime_with_return p1=new prime_with_return();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int count=p1.prime(no);
		if(count==2) {
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
	}

}
