package Array_Programs;

public class duplicate_elements {

	public static void main(String[] args) {
		int a[]= {10,4,2,10,5,4,4,2,10};
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) 
				{
					count++;
				}}
				if(count==1) {
					System.out.println(a[i]);
				}
		}
	}

}
