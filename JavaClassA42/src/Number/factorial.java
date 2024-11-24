package Number;

public class factorial {

	public static void main(String[] args) {
		int no=144;
		int sum=0;
		while(no>0)
		{
			int rem=no%10;
			int fact=1;
		for(int i=1;i<=rem;i++)
		{
			fact*=i;
		}
		 sum=sum+fact;
        no=no/10;
	}
		//if(no==sum)
		{
		System.out.println(sum);
		}
		//else
		//{
			//System.out.println("not a strong number");
		//}
}
}
