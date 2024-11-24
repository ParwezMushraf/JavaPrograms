package hashcode;

public class Employee {
	
	String name;
	int id;
	long c_no;
	
	Employee(String name,int id,long c_no){
		this.name=name;
		this.id=id;
		this.c_no=c_no;
	}
	
	public String toString() {
		System.out.println("Employee name"+name);
		System.out.println("Employee id"+id);
		System.out.println("Employee c_no"+c_no);
		return "";
		}
	
     public int hashCode() {
    	 return id;
     }

	public static void main(String[] args) {
		Employee e1=new Employee("Ali",1234,894561237l);
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
		Employee e2=new Employee("aman",324,8947894237l);
		System.out.println(e2);
		System.out.println(e2.hashCode());
		System.out.println(e1.hashCode()==e2.hashCode());
		

	}

}
