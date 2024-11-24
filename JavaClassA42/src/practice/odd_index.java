package practice;

public class odd_index {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		{
			for(int i=0;i<=a.length-1;i++) {
			   if(((a[i])%2!=0)) {
				   System.out.println("odd"+a[i]);
			   }
			}
		}

	}

}
