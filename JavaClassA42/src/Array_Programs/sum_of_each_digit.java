package Array_Programs;

public class sum_of_each_digit {

	public static void main(String[] args) {
	int a[]= {54,525,441,445,44,99};

	for(int i:a) {
		int sum=0;
		int i1=i;
		while(i1>0) {
		int rem=i1%10;
	     sum=sum+rem;	
	     i1=i1/10;
	
	}
		System.out.println(sum+i1);
	}
	}

}
