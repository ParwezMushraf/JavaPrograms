package Number;

public class sumfactorial {

	public static void main(String[] args) {
		int no=18;
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			
			if(no%i==0)
			{
				sum=i+sum;
				//System.out.println(i);
			}
		}
		System.out.println(sum);
	}

}
