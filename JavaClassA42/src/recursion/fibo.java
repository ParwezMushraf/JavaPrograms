package recursion;
import java.util.Scanner;

public class fibo {
	
	static int fibo(int n) {
		if(n==1 || n==2)
			return 1;
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		System.out.println("enter the n term");
		int n= new Scanner(System.in).nextInt();
		System.err.println(fibo(n));

	}

}
 