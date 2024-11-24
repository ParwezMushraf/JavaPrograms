package Array_Programs;

public class smallest_digit {

	public static void main(String[] args) {
		int  a[]= {555,444,12,321,435,44,99};
	    int min=a[0];
	    for(int i=0;i<=a.length-1;i++) {
	    	if(a[i]<=min) {
	    		min=a[i];
	    	}
	    	
	    }
	    System.out.println(min);
	}

}
