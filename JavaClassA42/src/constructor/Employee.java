package constructor;

public class Employee {
	String name;
	double sal;
	
	public Employee(String name,double sal)
	{
		System.out.println(name);
		System.out.println(sal);
		name=name;
		sal=sal;
	}
	{
		System.out.println("non static block");
    }

}
