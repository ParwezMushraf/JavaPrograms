package polymorphism;

public class student extends human {
	
	public  void acting(String s1) {
		System.out.println(s1 +" some how studying");
	}

	public static void main(String[] args) {
        human h1= new student();
        h1.acting("nikhil"); 

	}

}
