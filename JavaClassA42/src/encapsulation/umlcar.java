package encapsulation;

public class umlcar {
	
		private String colour;
		private double price;
		private String brand;
		private String model; 
	    
	    public String getcolour() 
	    {
	    	
	    	return colour ;
	    }
	    
	 public double getprice()
	 {
	    	return price ;
	    }
	 
	 public String getbrand() 
	 {
	 	return brand ;
	 }
	 
	 public String getmodel() 
	 {
	 	return model ;
	 }
	 
	 public void setcolour(String colour )
	 {
		 this.colour=colour;
	 }
	 public void setprice(double price ) 
	 {
		 this.price=price;
	 }

	 public void setbrand(String brand) 
	 {
	     this.brand=brand;
	 }
	 
	 public void setmodel(String model) 
	 {
	     this.model=model;
	 }
	 
	 public umlcar(String colour,double price,String brand,String model) 
	 {
		 this.colour=colour;
		 this.price=price;
		 this.brand=brand;
		 this.model=model;
	 }

	

	}


