package array2D_programs;

import java.util.Scanner;

public class diagonal    {

	public static void main(String[] args) {
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
				if(s1[i]==s1[j]) {
					System.out.print(s1[i][j]);
			}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();

	}

	}}
