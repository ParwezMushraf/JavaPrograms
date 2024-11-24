package encapsulation;

public class employee {
	private String name;
	private int id;
	private double sal;
	
	public employee(String name,int id,double sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public double getsal() {
		return sal;
	}
	public void setsal(double sal) {
	if(sal>=10000)
		this.sal=sal;
	else
		System.out.println("not validate");
	
	}
}
