package Alphabetpattern;

public class alphaR {

	public static void main(String[] args) {
		int n=9;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if(j==1&&i!=1||i==1&&j!=1&&j!=n||i==(n+1)/2&&j!=n||j==n&&i<=(n+1)/2&&i!=1&&i!=(n+1)/2 ||i==j&&i>=(n+1)/2)
					  
				   
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
