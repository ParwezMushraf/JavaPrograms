package object_class;

public class employee {
	String name;
	double sal;
	int id;
	
	employee(String name,double sal,int id){
		this.name=name;
		this.sal=sal;
		this.id=id;
	}
	
	public String toString() {
		return name+" "+sal+" "+id+" ";
	}
	
	

	public static void main(String[] args) {
	   employee e1=new employee("Ali",25000,45);
	   employee e2=new employee("mani",30000,5);
	   employee e3=new employee("nikhil",85000,2);
	   employee e4=new employee("rama",75000,56);
	   employee e5=new employee("sree",35000,4);
	   employee e6=new employee("parwez",45000,9);
	   employee e7=new employee("pops",65000,25);
	   employee e8=new employee("manoz",55000,3);
       
	   employee emp[]= {e1,e2,e3,e4,e5,e6,e7,e8};
	   for(employee i:emp) {
		   System.out.println(i);
	   }
}

}
