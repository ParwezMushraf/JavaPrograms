package patterns;

public class star16 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print(j%2 +"");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
