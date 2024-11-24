package encapsulation;

public class bag {
	private String name;
	private double price;
	private String brand;
	private String colour;
	private String type;
	
	public bag(String name,double price,String brand,String colour,String type)
	{
		this.name=name;
		this.price=price;
		this.brand=brand;
		this.colour=colour;
		this.type=type;
	}
        public String getname() {
        	return name;
        }
        
        public void setname(String name) {
        	this.name=name;
        }
        public double getprice() {
        	return price;
        }
        public void setprice(double price) {
        	if(price>=1200) {
        	this.price=price;
        }
        	else{
        		System.out.println("not possible");
        		}
        	}
        public String getbrand() {
        	return brand;
        }
        public void setbrand(String brand) {
        	this.brand=brand;
        }
        public String getcolour() {
        	return colour;
        }
        public void setcolour(String colour) {
        	this.colour=colour;
        }
        public String gettype() {
        	return type;
        }
        public void settype(String type) {
        	this.type=type;
        }
        
}
