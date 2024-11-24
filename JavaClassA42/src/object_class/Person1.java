package object_class;

public class Person1 {
	
	String name;
	int age;
	long c_no;
	
	Person1 (String name,int age,long c_no){
		this.name=name;
		this.age=age;
		this.c_no=c_no;
	}

	public String toString() {
		return name+" "+age+" "+c_no;
	}

	public static void main(String[] args) {
		Person1 p1=new Person1("Ali",25,1234567899l);
		System.out.println(p1);
		Person1 p2=new Person1("nikhil",22,2578962315l);
		System.out.println(p2);
		System.out.println(p1.equals(p2));

	}

}
