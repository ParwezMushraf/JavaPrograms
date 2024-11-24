package Array_Programs;

public class remove_duplicate {

	public static void main(String[] args) {
		int a[]= {1,2,12,21,21,12,15,21,23,23,23};
		for(int i=0;i<=a.length-1;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) 
				{
					count++;
				}}
				if(count<1) {
					System.out.println(a[i]);
				}
		}

	}

}
