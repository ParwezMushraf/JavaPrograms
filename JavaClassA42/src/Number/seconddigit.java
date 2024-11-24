package Number;

public class seconddigit {

	public static void main(String[] args) {
		int no=78986;
		while(no>=99) {
			no=no/10;
		}
		int no1=no;
		int rem=no1%10;
		System.out.println(rem);

	}  
}
