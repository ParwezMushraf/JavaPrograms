package Number;

public class happynum_range {

	public static void main(String[] args) {
		int count=0;
		 for(int i=1;i<=1000;i++)
		 {
		   int no=i;
		   int no1=no;
		   while(true)
		   {
		   int sum=0;
		   int sq=1;
		   while(no>0) {
			   int rem=no%10;
		   sq=rem*rem;
		   sum=sum+sq;
		   no=no/10;
		   }
		   no=sum;
			if(no==1)
			{
				count++;
				System.out.println("happy number "+no1);
				break;
			} 
			else if(no==4)
			{
				break;
			}
			} 
		   }
			System.out.println(count); 
}
}

