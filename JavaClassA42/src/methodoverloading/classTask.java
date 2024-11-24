package methodoverloading;

public class classTask {
	
	 static void add()
	{
		System.out.println("no argument method");
	}
	
	private static void add(int a)
	{
		System.out.println(a);
	}
	
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}   
	//public void add(int a,int b,double c) {
		//System.out.println(a+b-c);

	//}
	
	public static void main(String[] args) {
		
       add();
       //add(10,10);
       add(30);
       //add(10,50,20);
		classTask t=new classTask();
		t.add(30,20,30.0);
       
	}

}
