package Array_Programs;

public class second_largest_element {

	public static void main(String[] args) {
		
				int a[]= {10,20,903,40,5,99,153};
				int first=a[0];
				for(int i=0;i<=a.length-1;i++) {
					if(a[i]>first) {
						first=a[i];
					}
				}
				//System.out.println(first);
				int sec=0;
				for(int j=0;j<=a.length-1;j++) {
					if(a[j]>sec && a[j]!=first) {
						sec=a[j];
					}
				}
				System.out.println(sec);
			}
		}
