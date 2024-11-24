package Array_Programs;

public class ascending_elements {

	public static void main(String[] args) {
		int a[]= {5,8,9,7,6};
		int acc;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				if(a[j]>a[i]) {
					acc=a[j];
					a[j]=a[i];
					a[i]=acc;
					 
				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
		System.out.println(a[i]);
	}
	  
	   

}
