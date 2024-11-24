package pattern_digits;

public class digit_10 {

	public static void main(String[] args) {
		int n=7;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if(j==1||j==2&&i!=1&&i!=n||i==1&&j!=n&&j!=2
						  ||i==n&&j!=n&&j!=2||j==n&&i!=1&&i!=n)
					  
				   
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
