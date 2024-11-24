package patterns;

public class starx {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j&&j<=(n+1)/2||i+j-1==(n+1)/2) {
				System.out.print("*");
				}
			else
				{
				System.out.print(" "); 
				}
			}
			System.out.println();
		}

	}

}
