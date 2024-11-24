package constructor_chaining;

public class Twitter {
	
	String name;
	int size;
	
	public Twitter() {
		System.out.println("no argument con... ");
	}
	
	public Twitter(String name) {
		this();
		this.name=name;
	}
	
	public Twitter(int size) {
		this("twitter");
		this.size=size;
	}

	public static void main(String[] args) {
	      Twitter t=new Twitter(12);
	      System.out.println(t.name);
	      System.out.println(t.size);
		

	}

}
