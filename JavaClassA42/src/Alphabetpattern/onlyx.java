package Alphabetpattern;

public class onlyx {

	public static void main(String[] args) {
		int n=9;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				 // if(i==(n+1)/2&&j==(n+1)/2)
					  if(i==j&&i+j==(n+1))
				   
				   {
					   System.out.print(" *");
				   }
				   else {
					   System.out.print("  ");
				   }
			   }
			   System.out.println();

		   }

	}


	}

