
package EXCEPTIONS;

public class null_exception {
	
	String name;
	double price;
	
	null_exception(String name,double price){
		this.name=name;
		this.price=price;
		
	}

	public static void main(String[] args) {
		//null_exception n= new null_exception("java",7876);
		null_exception n=null;
		System.out.println(n.name);
		System.out.println(n.price);
		

	}

}
