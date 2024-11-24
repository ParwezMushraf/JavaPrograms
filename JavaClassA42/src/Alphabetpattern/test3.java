package Alphabetpattern;

public class test3 {

	public static void main(String[] args) {
		int n=9;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				 
					  if(i==1&&j!=1&&j!=n
							  ||j==1&&i!=1&&i!=n
							  ||i==n&&j!=1&&j!=n
							  ||j==n&&i!=1&&i!=n
							  ||i==j&&j!=1&&j!=n
							  ||i+j==(n+1)&&j!=1&&j!=n)
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
