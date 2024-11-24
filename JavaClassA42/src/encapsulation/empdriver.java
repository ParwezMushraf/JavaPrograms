package encapsulation;

public class empdriver {

	public static void main(String[] args) {
		employee e=new employee("Ali",786,12000);
		System.out.println(e.getname());
		System.out.println(e.getid());
		System.out.println(e.getsal());
		e.setsal(8000);
		System.out.println(e.getsal());
	}
}


