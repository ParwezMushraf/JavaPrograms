package Array_Programs;

public class array_count {
	
	public static int count(int n) {
		
		int count=0;
        	  while(n>0) {
        		  int rem=n%10;
        		  count++;
        		 n= n/10;
        	  
		}	
		return count;
		
	}

	public static void main(String[] args) {
		int a[]= {54,525,441,445,44,99};
		for(int i:a) {
		System.out.println(count(i));
		}

	}

}
