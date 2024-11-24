package Array_Programs;

public class array_sum_odd {

	public static void main(String[] args) {
		int arr[]= {10,20,40,90,110,99,88,3,7,11};
		 int sum=0;
		 for(int i:arr) {
			 if(i%2!=0) {
				 sum=sum+i;
				 
			 }
		 }
		 System.out.println(sum);

	}

}
