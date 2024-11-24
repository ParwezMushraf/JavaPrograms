package recursion;
import java.util.Scanner;

public class jos {
	
	static int jos(int n,int r) {
		if(n==1)
			return 0;
		return ((jos(n-1,r)+r)%n);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of person");
		int n=s.nextInt();
		System.out.println("enter ratio");
		int r=s.nextInt();
		System.out.println(jos(n,r)+1);

	}

}
