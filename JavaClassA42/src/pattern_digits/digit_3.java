package pattern_digits;

public class digit_3 {

	public static void main(String[] args) {
		int n=9;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if(i==1&&j!=n&&j>=(n+1)/2||i==n&&j!=n&&j>=(n+1)/2
						  ||j==n&&i!=1&&i!=(n+1)/2&&i!=n
						  ||i==(n+1)/2&&j!=n&&j>=(n+1)/2)
					  
				   
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
