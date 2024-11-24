package constructor;

public class book {
	String name;
	int no_pages;
	double price;
	
	public book(String name,int no_pages,double price)
	{
		this.name=name;
		this.no_pages=no_pages;
		this.price=price;
	}

	public static void main(String[] args) {
	 book b=new book("java",120,250.0);
      System.out.println(b.name);
      System.out.println(b.no_pages);
      System.out.println(b.price);
      
      book b1=new book("manal",89,450.0);
      System.out.println(b1.name);
      System.out.println(b1.no_pages);
      System.out.println(b1.price);
                                                                         
      book b2=new book("sql",60,240.0);
      System.out.println(b2.name);
      System.out.println(b2.no_pages);
      System.out.println(b2.price);	  
      
      book b3=new book("selenium",70,340.0);
      System.out.println(b3.name);
      System.out.println(b3.no_pages); 
      System.out.println(b3.price);
      
      book b4=new book("API",80,430.0);
      System.out.println(b4.name);
      System.out.println(b4.no_pages);
      System.out.println(b4.price);
      
	}
	

}
