package Number;

public class strongnumrange {

	public static void main(String[] args) {
		for(int j=200;j>=1;j--)
		{
			int sum=0;
			int no=j;
			int no1=no;
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
		System.out.println("strong number "+no1);
		}
	
}
}

	}

