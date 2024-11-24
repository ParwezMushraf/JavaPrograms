package hashcode;

public class Ali {
	
	String name;
	int id;
	long c_no;
	
	 Ali(String name,int id,long c_no) {
		this.name=name;
		this.id=id;
		this.c_no=c_no;
		
	}
	 
	 public int hashCode() {
		 return (int)c_no;
	 }

	 
	 public String toString() {
		 System.out.println("employee name"+name);
		 System.out.println("employee id"+id);
		 System.out.println("employee c_no"+c_no);
		 return "";
	 }
	 
	
	public static void main(String[] args) {
		Ali a1=new Ali("Ahamad",156,789664l);
		System.out.println(a1);
		System.out.println(a1.hashCode());
	}

}
