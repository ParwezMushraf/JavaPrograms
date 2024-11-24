package patterns;

public class star5 {

	public static void main(String[] args) {
		int n=4;
		int rem=0;
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				rem=i%2;
				
				
				System.out.print(rem);
				//System.out.print(i +" ");
				
			}
		System.out.println();
		}

	}

}
