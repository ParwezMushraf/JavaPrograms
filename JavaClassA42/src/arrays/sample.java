package arrays;

public class sample {
	
	public static void main(String []args) {
		int a[]=new int[4];
		a[2]=20;
		a[0]=a[2];
		a[1]=30;
		a[3]='A';
		System.out.println(a[3]);
		System.out.println(a[2]);
		System.out.println(a[1]);
		System.out.println(a[0]);
	}

}
