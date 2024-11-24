package Array_Programs;

public class descending_elements {

	public static void main(String[] args) {
		int a[]= {5,8,9,7,6};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		for(int i:a)
		System.out.println(i);

	}

}
