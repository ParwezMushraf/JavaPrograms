package Number;

public class composite {

	public static void main(String[] args) {
		int no=6;
		int count=0;
		
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("its a composite number"+no);
		}
		else
		{
			System.out.println("its not a composite number"+no);
		}
	}

}
