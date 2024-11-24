package method_overriding;

public class chandhrayan3 extends chandhrayan2 {
	public void moonsurface() {
		super.moonsurface();
		System.out.println("entered fully");
	}
	

	public static void main(String[] args) {
		chandhrayan3 c=new chandhrayan3();
		c.moonsurface();

	}

}
