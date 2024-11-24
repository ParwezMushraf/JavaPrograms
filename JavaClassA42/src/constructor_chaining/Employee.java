package constructor_chaining;

public class Employee extends person {
	String name1;
	double sal;
	public Employee(String name1,double sal,String name,int age) {
		super(name,age);
		this.name1=name1;
		this.sal=sal;
	}

	public static void main(String[] args) {
		Employee e=new Employee("ali",15000,"Tarun",22);
		System.out.println(e.name1);
		System.out.println(e.sal);
		System.out.println(e.name);
		System.out.println(e.age);
	}

}