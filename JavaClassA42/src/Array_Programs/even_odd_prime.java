package Array_Programs;

public class even_odd_prime {
	
	public static void main(String[] args) {
		
		int arr[]= {20,30,10,2,1,40,11,7,13,31};
		int count1=0;
		int count2=0;
	    int count3=0;
		for(int i:arr) 
		{
			if(i%2==0) {
			count1++;
			}
		if(i%2!=0) {
			count2++;
		} int count4=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) {
					count4++;
					}}
					if(count4==2) {
						count3++;
				
			}
					
		}
		System.out.println("No of even numbers in given elements is -> "+count1);
		System.out.println("No of odd numbers in given elements is -> "+count2);
		System.out.println("No of Prime numbers in given elements is -> "+count3);

	}

}
