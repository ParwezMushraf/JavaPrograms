package constructor_chaining;

public class instagram {
	String name;
	int size;
	
	public instagram() {
		System.out.println("chats");
	}
	
	public instagram(String name) {
		this();
		this.name=name;
	}
	
	public instagram(int size) {
		this("insta");
		this.size=size; 
	}

	public static void main(String[] args) {
		instagram i=new instagram(45);
		//instagram i1=new instagram(78);
		System.out.println(i.name);
		System.out.println(i.size);
		//System.out.println(i1.name);
		//System.out.println(i.size);
		
	}

}
