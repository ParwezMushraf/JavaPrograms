package COLLECTIONS;
import java.util.ArrayList;

public class merge_two_Arrays {

	public static void main(String[] args) {
		int a[]= {45,92,56,46,78,40};
		int a1[]= {17,26,420,18,99,20};
		ArrayList<Integer> al1=new ArrayList();
		for(int i=0,j=0;i<=a.length-1&&j<=a1.length-1;i++,j++) {
			al1.add(a[i]);
			al1.add(a[j]);
		}
		System.out.println(al1);
	}

}
