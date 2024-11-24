package recursion;

public class print {
	
	static void print(int n) {
		if(n<=0)
			return;
		System.out.println(n);
		System.out.println(n-1);
	}

	public static void main(String[] args) {
		print(5);

	}

}
