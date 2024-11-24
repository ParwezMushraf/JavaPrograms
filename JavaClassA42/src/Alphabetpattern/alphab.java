package Alphabetpattern;

public class alphab {

	public static void main(String[] args) {
		int n=9;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if(j==1||i==1&& j!=n||i==n&& j!=n||j==n&& i!=1&& i!=n &&i!=(n+1)/2|| i==(n+1)/2&& j!=n)
					  
				   
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
