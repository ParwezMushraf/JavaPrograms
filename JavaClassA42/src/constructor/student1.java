package constructor;

public class student1 {
	String Name;
	int Id;
	String Email;

	public student1(String name,int id,String email){
		System.out.println(name);
		System.out.println(id);
		System.out.println(email);
        Name=name;
		Id=id;
		Email=email;
	}
	public static void main(String[] args) {
		
      student1 s=new student1("ali",786,"skali@gmail.com");
    		  System.out.println(s.Name);
             System.out.println(s.Id);
             System.out.println(s.Email);
	}

}
