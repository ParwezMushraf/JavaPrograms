package array2D_programs;

import java.util.Scanner;

public class sum_of_evn_odd {

	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int row=sc.nextInt();
		System.out.println("enter the col");
		int col=sc.nextInt();
		int s1[][]=new int[row][col];
		for(int i=0;i<=s1.length-1;i++) {
		  for(int j=0;j<=s1.length-1;j++) {
			  System.out.println(i+":"+j);
			  s1[i][j]=sc.nextInt();
		  }
			
		}
		
		for(int i=0;i<=s1.length-1;i++) {
			for(int j=0;j<=s1.length-1;j++) {
				if(s1[i][j]%2==0) {
					sum=sum+s1[i][j];
				}
				else {
					sum1=sum1+s1[i][j];
				}
			}
	}
		System.out.println("sum of the even is "+sum);
		System.out.println("sum of the odd is "+sum1);

	}
}
