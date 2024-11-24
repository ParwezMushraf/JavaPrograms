package abstraction;

public class D implements C{

	public void m1() {
		System.out.println("Hii");
	}
	
		public void m2() {
			System.out.println("HII");
			
		}
		public static void main(String[] args) {  
			D d1=new D();
			System.out.println(d1.a);
			System.out.println(d1.b);
			d1.m1();
			d1.m2();
			
			
		}
	

}
