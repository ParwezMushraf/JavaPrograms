package encapsulation;

public class umldiagram {
	private String product_name;
    private String product_id;
    private double price;
    private String payment;
    
    public String getname() {
    	
    	return product_name ;
    }
    
 public String getid()
 {
    	return product_id ;
    }
 
 public double getprice() 
 {
 	return price ;
 }
 
 public String getpayment()
 {
 	return payment ;
 }
 
 public void setname(String product_name)
 {
	 this.product_name=product_name;
 }
 public void setid(String product_id ) 
 {
	 this.product_id=product_id;
 }
 
 public void setprice(double price) 
 {
	 this.price=price;
 }
 
 public void setpayment(String payment)
 {
	 this.payment=payment;
 }
 
    public umldiagram() {
    	this.product_name=product_name;
    	this.product_id=product_id;;
    	this.price=price;
    	this.payment=payment;
    }
}
