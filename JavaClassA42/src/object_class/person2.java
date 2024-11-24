package object_class;

public class person2 {
	
	String name;
	int age;
	long c_no;
	
	person2 (String name,int age,long c_no){
		this.name=name;
		this.age=age;
		this.c_no=c_no;
	}

	public String toString() {
		return name+" "+age+" "+c_no;
	}
	
	public boolean equals(object obj) {
		person2 p1=(person2)obj;
		return this.name==p1.name && this.age==p1.age && this.c_no==p1.c_no;
	}

	public static void main(String[] args) {
		person2 p1=new person2("Ali",25,1234567899l);
		System.out.println(p1);
		person2 p2=p1;
		System.out.println(p2);
		System.out.println(p1.equals(p2));

	
	

	}

}
