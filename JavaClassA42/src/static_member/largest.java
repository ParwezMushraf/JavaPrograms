package static_member;

public class largest {
	static int a=10;
	static int b=20;
	static int c=30;
	public static void m1()
	{
		int res=a>b?a:b;
		int res1=res>c?res:c;
		System.out.println(res1);
	}
	public static void main(String []args)
	{
		m1();
		}

}
