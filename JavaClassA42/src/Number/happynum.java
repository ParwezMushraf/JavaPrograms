package Number;

public class happynum {

	public static void main(String[] args) {
	   int no=13;
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
			System.out.println("happy number "+no1);
			break;
		}
	 else if(no==4)
		{
			System.out.println("sad number "+no1);
			break;
		}
	   }
	   

	}

}
