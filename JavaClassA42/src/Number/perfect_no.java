package Number;

public class perfect_no {

	public static void main(String[] args) {
		int no=6;
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=i+sum;
			}
		}
			if(no==sum)
			{
				System.out.println("is a perfect number");
			}
			else
			{
				System.out.println("not a perfect number");
			}											
        System.out.println(sum);
	}

}
