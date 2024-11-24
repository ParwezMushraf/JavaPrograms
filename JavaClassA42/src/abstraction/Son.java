package abstraction;

public class Son implements Father,Mother {
	
	public void hardworking() {
		 
		System.out.println("Father works hard and earns money for family");
	}
	
	public void caring() {
		System.out.println("Mother shows caring towards children ");
	}

	public static void main(String[] args) {
	    Son s=new Son();
	    s.hardworking();
	    s.caring();
	   // s.hardwork();
		

	}
	

}
