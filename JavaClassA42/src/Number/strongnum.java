package Number;

public class strongnum {
	
	public static void main(String[] args) {
	
			int no=145;
			int no1=no;
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
		if(no1==sum)
		{
		System.out.println("strong number    ="+no1);
		}
		else
		{
			System.out.println("not a strong number"+no1);
		}
}
}