package Number;

public class primefactor {

	public static void main(String[] args) {
		int no=14;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				//int pn=i;
				 int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}	
			if(count==2) {
				System.out.println("prime factors"+i);
			}
		}
         	}

}  }
