package Number;

public class even_odd_no {
	

	public static void main(String[] args) {
		int no=12345;
		int Oddcount=0;  
		int evncount=0;
		while(no>0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				evncount++;
			}
			else
			{
				Oddcount++; 
			}
			no=no/10;
		}
				System.out.println("no of even digits in given number "+evncount);
					System.out.println("no of odd digits in given number "+Oddcount);
			}
		}



