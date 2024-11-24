package Array_Programs;

public class sum_of_first_second_element {

	public static void main(String[] args) {
		int a[]= {1,7,6,78,59};
		int first=a[0];
		int second=a[1];
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>first) {
				second=first;
				first=a[i];
			}
			else if(a[i]>second && a[i]!=first) {
				second=a[i];
			}
		}
		sum=first+second;
		System.out.println(sum);
          
	}

}
