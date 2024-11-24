package object_class;

public class student {
	
	String name;
	int id;
	String email;
	
	student(String name,int id,String email){
		this.name=name;
		this.id=id;
		this.email=email;
	}
	
	public String toString() {
		return name+" "+id+" "+email+" ";
	}

	public static void main(String[] args) {
		student s=new student("Ali",45,"skali@gmail.com");
		
		System.out.println(s);

	}

}
