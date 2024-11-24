package Number;

public class xyleam_phleom {

	public static void main(String[] args) {
		int no=1054;
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
	    System.out.println(res);
	    System.out.println(sum);
	    
	if(sum==res)
	{
		System.out.println("it is a xyleam number");
	}
	else
	{
		System.out.println("it is a phleom number");
	}

}
}