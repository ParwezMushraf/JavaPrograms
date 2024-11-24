package Array_Programs;

public class sec_large_element {

	public static void main(String[] args) {
		int a[]= {1,7,6,78,59};
		int first=a[0];
		int second=a[1];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>first) {
				second=first;
				first=a[i];
			}
			else if(a[i]>second && a[i]!=first) {
				second=a[i];
			}
		}
		System.out.println("first largest "+first);
		System.out.println("second largest "+second);

	}

}
