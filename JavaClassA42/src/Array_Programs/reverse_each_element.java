package Array_Programs;

public class reverse_each_element {

	public static void main(String[] args) {
	int a[]= {12,55,65,687};
	
	for(int i:a) {
		int i1=i;
		int res=0;
		while(i>0) {
		res=(i%10)+res*10;
		i=i/10;
	}
		System.out.println("reverse of element "+i1+ " is "+res);
	}
	}

}
