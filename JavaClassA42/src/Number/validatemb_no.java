package Number;

public class validatemb_no {

	public static void main(String[] args) {
		long no=1234567891L;
		int count=0;
		while(no>0)
		{
	    long rem=no/10;	
		no=no/10; //no=no/10;
		count++;  //count++;
		}
		if(count==10)
		{
			System.out.println("validate mobile number");
		}
		else
		{
			System.out.println("not a validate mobile number");
		}

	}

}
