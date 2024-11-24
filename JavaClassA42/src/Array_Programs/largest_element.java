package Array_Programs;

public class largest_element {

	public static void main(String[] args) {
	int  a[]= {555,444,12,321,435,44,99};
	    int max=a[0];
	    for(int i=0;i<=a.length-1;i++) {
	    	if(a[i]>=max) {
	    		max=a[i];
	    	}
	    	
	    	
	    }
	    System.out.println(max);

	}

}
