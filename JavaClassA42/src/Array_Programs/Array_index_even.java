package Array_Programs;

public class Array_index_even {

	public static void main(String[] args) {
		int arr[]= {10,20,40,90,110,99,88,3,7,11};
		
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
			
		}

	}

}
