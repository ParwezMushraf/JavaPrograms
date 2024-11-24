package arrays;
import java.util.Scanner;

public class longarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		long l[]=new long[size];
		System.out.println(l.length);
		
		for(int i=0;i<=l.length-1;i++) {
			System.out.println("enter the index value"+i);
			l[i]=sc.nextLong();
			
		}
		
		for(int i=0;i<=l.length-1;i++) {
			System.out.println(l[i]);
		}

	}

}
