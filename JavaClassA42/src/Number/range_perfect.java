package Number;

public class range_perfect {
	public int range(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		range_perfect s1=new range_perfect();
		for(int i=1;i<=500;i++)
		{
			if(s1.range(i)==i)
			{
				System.out.println(i);
			}
		}
	}

}
