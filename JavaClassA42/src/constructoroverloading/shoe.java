 package constructoroverloading;

public class shoe {
	
	String name;
	Double price;
	int size;
	String colour;
	
	public shoe()
	{
		 System.out.println("no arguments constructor");
	}
	public shoe(String name)
	{
		this.name=name;
	}

	public shoe(String name,double price)
	{
	this.name=name;
	this.price=price;
	}
	
	public shoe(String name,double price,int size)
	{
	this.name=name;
	this.price=price;
	this.size=size;
	} 
	
	public shoe(String name,double price,int size,String colour)
	{
	this.name=name;
	this.price=price;
	this.size=size;
	this.colour=colour;
	}
}
