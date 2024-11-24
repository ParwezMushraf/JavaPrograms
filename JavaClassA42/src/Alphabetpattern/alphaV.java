package Alphabetpattern;

public class alphaV {

	public static void main(String[] args) {
		int n=7;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if(i-j==n/2||i+j==n+(n+1)/2||j==n&&i<=(n+1)/2||j==1&&i<=(n+1)/2)
					  
				   
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
