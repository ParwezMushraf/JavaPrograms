package Number;

public class armstrong2 {
	static int no=153;
	static int no1=no;
	static int no2=no;
	static int count=0;
	static int sum=0;
	public static void m1()
	{
		while(no>0)
		{
			int rem=no%10;
			count++;
			no=no/10;
		}
		System.out.println(no);
		System.out.println(count);
	}
	
	public static void m2()
	{
		while(no1>0)
		{
			int rem=no1%10;
			int mul=1;
			 for(int i=1;i<=count;i++)
			 {
				 mul= rem*mul; 
		
			 }
			sum=sum+mul;
			no1=no1/10;
		}
         System.out.println(no1);
         System.out.println(sum);
       if(no2==sum)
       {
    	   System.out.println("its a armstrong number  "+sum);
       }
       else
       {
    	   System.out.println("its not a armstrong number  ");
       }
	}
	

	public static void main(String[] args) {
		m1();
		m2();

	}

}
