package Number;

public class firstlastdigit {

	public static void main(String[] args) {
     int no=1489;
     int rem=no%10;
     System.out.println(rem);
	while(no>=9)
	{
		no=no/10;
	}
	System.out.println(no);
	}

}
