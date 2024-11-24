package Number;

public class Aadhar {
	public static void main (String [] args)
	{
		long no=123456789102L;
		int count=0;
		while(no>0)
		{
	    long rem=no/10;	
		no=no/10; //no=no/10;
		count++;  //count++;
		}
		if(count==12)
		{
			System.out.println("validate Aadhar number");
		}
		else
		{
			System.out.println("not a validate Aadhar number");
		}
	}

}
