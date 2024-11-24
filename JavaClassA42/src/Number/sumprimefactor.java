package Number;

public class sumprimefactor {

	public static void main(String[] args) {
		int no=14;
		int sum=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				 int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				int pn=i;
				sum=sum+pn;
				System.out.println("prime factors"+pn);
				
			}
		}
         	}
		System.out.println(sum);
	}

}
