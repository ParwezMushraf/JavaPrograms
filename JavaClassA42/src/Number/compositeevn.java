package Number;

public class compositeevn {

	public static void main(String[] args) {
		for(int j=1;j<=20;j++)
		int no=j;
		int count=0;
		int sum=0;
		
		for(int i=1;i<no;i++)
		{
			if(no%j==0)
			{
				count++;
			}
		}
		if(no%2==0)
		{
		if(count==2)
		{
			System.out.println("its a composite number"+no);
		}
		}
		}

}


