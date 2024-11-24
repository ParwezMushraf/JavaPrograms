package methodoverloading;

public class methodmain {

	public static void main(String a) {
		System.out.println("hi");
	}
	public static void main(int a) {
		System.out.println(a);
	}
	public static void main(long b) {
		System.out.println(b);
	}
	public static void main(int d ,long b) {
		System.out.println(d+b);
	}
	public static void main(char c) {
		System.out.println(c);
	}
	
	public static void main(byte a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		main(10);
		main(3,2);
		main(123456);
		main('c');
        main(1);
        main("bg");
	}

}
