package Number;

public class phleomrange {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=1000;i++)
		{
			int no=i;
			int no1=no;
		int last=no%10;
		no=no/10;
		int sum=0;
		while(no>9)
		{
		int	rem=no%10;
		sum=sum+rem;
		no=no/10;
		}
	    int res=last+no;
	    
	if(sum!=res)
	{
		System.out.println("it is a phleom number"+no1);
		count++;
	}
		}
	System.out.println(count);
	}

}
