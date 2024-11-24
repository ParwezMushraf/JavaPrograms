package Number;

public class neon {
	
	public static String neon_num(int no)
	{
		 int sqr=no*no;
		 int sum=0;
		while(sqr>0)
		{
			int rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
			
		}
		if(sum==no)
		return "neon number"+no;
		
		else
			return "not neon number";
	}
	

	public static void main(String[] args) {
	
		System.out.println(neon_num(9));
	
	}
}
