package small_alphapattern;

public class small_alpha_d {

	public static void main(String[] args) {
		int n=7;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if(j==n||i==(n+1)/2&&j!=1||i==n&&j!=1||j==1&&i>=(n+1)/2&&i!=(n+1)/2&&i!=n)
					  
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
