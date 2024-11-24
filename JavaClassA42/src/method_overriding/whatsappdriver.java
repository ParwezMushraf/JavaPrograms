package method_overriding;

public class whatsappdriver extends whatsapp{
	   public void status() {
		   super.status();
		   System.out.println("upload photos");
		   
	   }

	public static void main(String[] args) {
		whatsappdriver w=new whatsappdriver();
	  w.status();
	  
		

	}

}
