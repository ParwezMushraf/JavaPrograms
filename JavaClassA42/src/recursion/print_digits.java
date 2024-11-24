package recursion;

public class print_digits {
	
	static void print(int n) {
		if(n<=0)
			return;
		System.out.println(n%10);
		System.out.println(n/10);
	}

	public static void main(String[] args) {
		print(29);
			
		}

	}


