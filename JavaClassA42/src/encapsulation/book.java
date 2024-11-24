package encapsulation;

public class book {
	private String name;
	
	public String getname()
	{
		return name;
	}
     public void setname(String name)
     {
    	 this.name=name;
     }
     public book(String name)
     {
    	 this.name=name;  
     }
}
