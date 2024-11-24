package patterns;

public class z_a {

	public static void main(String[] args) {
		int ch='z';
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch--+ " ");
			}
			System.out.println();
		}
		

	}

}
