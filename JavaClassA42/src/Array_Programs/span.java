package Array_Programs;

public class span {
	public static void main(String[] args) {
		int a[]= {10,15,75,18,89,95};
    int max=a[0];
    int min=a[0];
    for(int temp:a) {
    	if(temp>max) {
    		max=temp;
    	}
    	if(temp<min) {
    		min=temp;
    	}
    }
    System.out.println("sapan of an array is "+(max-min));
}

}
