package constructoroverloading;

public class consoverload {
	String name;
	int age;
	long ph_no;
	 public consoverload()
	{                    
		 System.out.println("no arguments constructor");
	}
	public consoverload(String Name) 
	{
		name=Name;
	}

	public consoverload(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public consoverload(String name,int age,long ph_no)
	{
		this.name=name;
		this.age=age;
		this.ph_no=ph_no;
	}

}
