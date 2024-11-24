package patterns;

public class star42 {

	public static void main(String[] args) {
		int n=7;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
					   
					  if(i==3
					    ||j==(n-1)&& i!=1  
						|| i==(n-1)&& j!=2 && j!=1 && j!=n
					    ||j==2 && i!=(n-1)&& i!=n && i!=1 && i!=2
					    
					    ) 
				   
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
