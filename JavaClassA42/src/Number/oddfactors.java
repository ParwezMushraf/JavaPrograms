package Number;

public class oddfactors {

	public static void main(String[] args) {
		int no=12;
		for(int i=1;i<=no;i++)
		{
		   if(no%i==0)
		   {
		   if(i%2==1)
		   {
			   System.out.println(i);
		   }
		   }
		}
		}
}

