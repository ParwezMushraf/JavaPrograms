package Number;

public class armstrongmethods {
	public static void m1()
	{
		int no=153;
		int no1=no;
		int no2=no;
		int count=0;
		int sum=0;
	
		while(no>0)
		{
			int rem=no%10;
			count++;
			no=no/10;
		}
		System.out.println(no);
		System.out.println(count);
	
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
    	   System.out.println("its not a armstrong number  "+sum);
       }
	}
	

	public static void main(String[] args) {
	
       m1();
	}

}
