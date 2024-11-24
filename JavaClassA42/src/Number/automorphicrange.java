package Number;

public class automorphicrange {

	public static void main(String[] args) {
		int count=0;
		int count1=0;
		int sum=0;
		int sum1=0;
		for(int i=1;i<=200;i++) {
		int no=i;
		int sqr=no*no;
		boolean flag=true;
	    while(no>0) {
	    	if(no%10==sqr%10) {
	    		no=no/10;
	    		sqr=sqr/10;
	    	}
	    	else
	    	{
	    		flag=false;
	    		break;
	    	}
	    }
	    if(flag==true)
	    {
	    	sum=sum+i;
	    	count++;
	    }
	    else
	    {	    	
	    	sum1=sum1+i;
	    	count1++;
	    }
		}
System.out.println("count of automorphic "+count);
System.out.println("count of not automorphic "+count1);
System.out.println("sum of automorphic numbers "+sum);
System.out.println("sum of not automorphic numbers "+sum1);
	}
	}


