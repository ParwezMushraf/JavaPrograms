package Alphabetpattern;

public class pract {

	public static void main(String[] args) {
		int n=5;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if((i+j)-1==(n+1)/2|| i-j==(n)/2||i+j==n+(n+1)/2||i==j-n/2)
					  
				   
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
