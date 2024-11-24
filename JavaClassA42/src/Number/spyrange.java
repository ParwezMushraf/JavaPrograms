package Number;

public class spyrange {

	public static void main(String[] args) {
		int count=0;
		for(int i=1000;i>=1;i--)
		{
			int no=i;
			int mul=1;
		int no1=no;
		//int no2=no;
		int sum=0;
		while(no>0) {
			int rem=no%10;
			sum=sum+rem;
			mul=mul*rem;
			no=no/10;
		}
		/*int mul=1;
		while(no1>0) {
			int rem=no1%10;
			 mul=mul*rem;           
			 no1=no1/10;
		}*/

		if(sum==mul)
		{
			System.out.println("it is a spy number"+no1);
			count++;
		}
		}
		System.out.println(count);
	}

}
