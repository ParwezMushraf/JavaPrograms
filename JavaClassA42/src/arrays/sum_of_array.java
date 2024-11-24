package arrays;

public class sum_of_array {
	
	public static void sum(int i1[]) {
		int sum=0;
		for(int i2:i1) {
			sum=sum+i2;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int ch[]= {4,8,2,7};
		sum(ch);

	}

}
