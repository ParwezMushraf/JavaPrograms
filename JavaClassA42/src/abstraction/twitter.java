package abstraction;

public class twitter extends Application {
	
	public  void signup(String name){
		System.out.println("enter the name"+"-"+name);
	}
    public void login(long c_no){
		System.out.println("enter the contact number"+"-"+ c_no);
	}

	public static void main(String[] args) {
		twitter t=new twitter();
		t.signup("ali");
		t.login(1246567899l);

	}

}
