package patterns;

public class star40 {

	public static void main(String[] args) {
		int n=7;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if(i==1 && j<=(n+1)/2&& j!=(n+1)/2 
						  || j==(n+1)/2 && i!=1 &&i!=n
						  ||i==(n+1)/2 &&j!=n &&j!=n 
						  || i==n&& j<=(n+1)/2 && j!=(n+1)/2 
						  || j==n && i>=(n+1)/2 && i!=(n+1)/2 )
				   
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