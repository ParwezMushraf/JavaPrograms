package object_class;

public class person {
	
	String name;
	int age;
	long c_no;
	
	person (String name,int age,long c_no){
		this.name=name;
		this.age=age;
		this.c_no=c_no;
	}

	public String toString() {
		return name+" "+age+" "+c_no;
	}

	public static void main(String[] args) {
		person p1=new person("Ali",25,1234567899l);
		System.out.println(p1);
		person p2=p1;
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		
		
	}

}
