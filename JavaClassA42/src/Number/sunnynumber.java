package Number;

public class sunnynumber {

	public static void main(String[] args) {
		int no=8;
		no++;
		boolean flag=true;
		for(int i=1;i<=no;i++) {
			if(i*i==no) {
				flag=false;
				break;
			}
			if(flag=true) {
				System.out.println("it is a sunny number"+no);
			}
			else {
			System.out.println("not a sunny number"+no);
			}
		}

	}

}
