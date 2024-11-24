package Number;

public class firstprime {

	public static void main(String[] args) {
	int no=985;
	int c=0;
	while(no>9) 
	{
		int rem=no%10;
		no=no/10;
	}
        System.out.println(no);
	
	for(int i=1;i<=no;i++)
	
		if(no%i==0) 
		{
			c=c+1;
		}
		if(c==2)
			{
			System.out.println("is a prime");
		}
		else
		{
			System.out.println("is not a prime");
		}
	

}}
