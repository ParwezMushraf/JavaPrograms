package Number;

public class number_binary {

	public static void main(String[] args) {
		int no=3855  ;
		String binary="";
		while(no>0) {
		 int rem=no%2;
		 binary=rem+binary;
		no=no/2;
		}
      System.out.println(binary);
	}

}
