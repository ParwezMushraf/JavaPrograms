package static_member;

public class statictask {
	static String s1="java";
	static {
		System.out.println(s1);
		System.out.println("hii");
	}
	static {
		System.out.println("ali");
		System.out.println("mani");
	}
    public static void m1()
    {
    	System.out.println(s1);
    	System.out.println("wat u dng");
    }
    public static void main(String [] args)
    {
    	m1();
    }
}
