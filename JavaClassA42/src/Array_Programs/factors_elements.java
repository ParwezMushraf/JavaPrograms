package Array_Programs;

public class factors_elements {

	public static void main(String[] args) {
		int a[]= {10,20,40};
		
		for(int i:a) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
				
					System.out.println(i+" element factor is "+j);
				}
				
			}
			
			
		}

	}

}
