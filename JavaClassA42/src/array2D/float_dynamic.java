package array2D;
import java.util.Scanner;

public class float_dynamic {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of row");
		int row =sc.nextInt();
		System.out.println("Enter the no.of col");
		int col=sc.nextInt();
		float arr[][]=new float[row][col];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
		System.out.println(i+":"+j);
		arr[i][j]=sc.nextFloat();
		}
		}
		System.out.println("---------------------------");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	

	}

}
