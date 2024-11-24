package Number;

public class largeofthree {

	public static void main(String[] args) {
		int a=10;
		int b=60;
		int c=30;
		if(a>b && a>c) {
			System.out.println("a is largest of three numbers "+a);
		}
		else if(b>a && b>c) {
			System.out.println("b is largest of three numbers "+b);
		}
		else if(c>a && c>b) {
			System.out.println("c is largest of three numbers"+c);
		}
	}

}
