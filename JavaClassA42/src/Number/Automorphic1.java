package Number;

public class Automorphic1 {

	public static void main(String[] args) {
	int no=25;
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
    if(flag==true) {
    	System.out.println("automorphic ");
    }
    else
    {
    	System.out.println("not automorphic");
    }
	}

}
