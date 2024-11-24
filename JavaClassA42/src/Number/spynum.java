package Number;

public class spynum {

	public static void main(String[] args) {
	
		int no=123;
		int no1=no;
		int no2=no;
		int sum=0;
		while(no>0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		int mul=1;
		while(no1>0) {
			int rem=no1%10;
			 mul=mul*rem;           
			 no1=no1/10;
		}
		
		if(sum==mul)
		{
			System.out.println("it is a spy"+no2);
		}
		else
		{
			System.out.println("it is not a spy");
		}
		}
}
