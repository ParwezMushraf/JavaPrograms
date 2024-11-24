package Number;

public class PerfectNumber {
	public void range()
	{
		for(int r=1;r<=200;r++)
		{
			int num=r;
			int sum=0;
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==num)
			{
				System.out.println("its a perfect number"+num);
			}
		}
	}

	public static void main(String[] args) {
	PerfectNumber p1=new PerfectNumber();
	p1.range();

	}

}
