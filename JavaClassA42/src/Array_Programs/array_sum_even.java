package Array_Programs;

public class array_sum_even {

	public static void main(String[] args) {
		 int arr[]= {10,20,40,90,110,99,88,3,7,11};
		 int sum=0;
		 for(int i=0;i<=arr.length-1;i++) {
			 if(arr[i]%2==0) {
				 sum=sum+arr[i];
				 
			 }
		 }
		 System.out.println(sum);
	}

}
