package Array_Programs;

public class Perfect_elements {

	public static void main(String[] args) {
		int a[]={2,3,4,8,6,28};
		
		for(int i:a) {
			int sum=0;
			
		for(int j=1;j<i;j++) {
			if(i%j==0) {
			sum=sum+j;
		}
		}
		
		if(i==sum) {
			System.out.println(i);
		}
		}	
	}

}
