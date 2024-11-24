package Number;

public class automorphic {

	public static void main(String[] args) {
	int no=25;
	int no1=no;
	int sqr=no*no;
	int last=0;
	int rev=0;

	while(sqr>0){
		int rem=sqr%10;
		int rem1=no%10;
	if(rem==rem1){
		last=(last*10)+rem;
	}
	sqr=sqr/10;
	no=no/10;
	}
	while(last>0){ 
		int rem=last%10;
		 rev=(rev*10)+rem;
		last/=10;
	}
	if(no1==rev)
	
	{
	    	System.out.println("it is a automorphic number");
    }
    else
    {
    	System.out.println("is not a automorphic number");
    }
	}

}
