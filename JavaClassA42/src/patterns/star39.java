package patterns;

public class star39 {

	public static void main(String[] args) {
		int n=9;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  if(i==1 && j>=(n+1)/2 && j!=(n+1)/2 
						  || j==(n+1)/2 && i!=1 && i!=n && i!=j
						  || i==n && j<=(n+1)/2 && j!=(n+1)/2
						  || j==1 && i<=(n+1)/2 && i!=(n+1)/2	  
						  ||i==(n+1)/2 &&j!=1 && j!=n && i+j!=n+1
						  ||j==n && i>=(n+1)/2 && i!=(n+1)/2
						  ||(i==j || i+j==n+1)&& (i==(n+1)/3 || j==(n+1)/3) || (i==j && i+j==n+(n+1)/2))
					  
				   
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
