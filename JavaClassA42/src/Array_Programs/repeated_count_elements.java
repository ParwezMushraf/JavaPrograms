package Array_Programs;

public class repeated_count_elements {

	public static void main(String[] args) {
		int a[]= {10,4,2,10,5,4,4,2,10};
		int elm=10;
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
			
			if(elm==a[i]) {
				count++;
			}
			}
			System.out.println(elm+" Number of repeated numbers "+count);
	
		
	}}


