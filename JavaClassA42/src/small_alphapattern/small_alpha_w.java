package small_alphapattern;

public class small_alpha_w {

	public static void main(String[] args) {
		int n=7;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if(j==1&&i!=n||j==n&&i!=n||j==(n+1)/2&&i!=n||i==n&&j!=1&&j!=(n+1)/2&&j!=n)
					  
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
