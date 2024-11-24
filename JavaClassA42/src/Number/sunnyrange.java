package Number;

public class sunnyrange {

	public static void main(String[] args) {
		for(int j=1;j<=100;j++) {
		int no=j;
		no++;
		boolean flag=true;
		for(int i=1;i<=no;i++) {
			if(i*i==no) {
				flag=false;
				break;
			}
		}
			if(flag==false) {
				System.out.println("it is a sunny number"+no);
			}
	}

}
}
