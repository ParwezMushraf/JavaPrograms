package Array_Programs;

public class count_palindrome {

	public static void main(String[] args) {
		int a[]={12,55,121,24};
		int count=0;
		for(int i:a) {
			
				int i1=i;
				int res=0;
				
				while(i>0) {
				res=(i%10)+res*10;
				i=i/10;
				
			}
				if(res==i1) {
					count++;
				}
			}
	
		System.out.println(count);
	}}
