package has_a_relationship;

public class contacts {

	String name;
	long mob_no;
	
	contacts(String name,long mob_no){
		this.name=name;
		this.mob_no=mob_no;
	}
	whatsapp w=new whatsapp("Ali",123456789l);
}
