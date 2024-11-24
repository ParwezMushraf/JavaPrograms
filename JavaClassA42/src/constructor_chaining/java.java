package constructor_chaining;

public class java extends C{
	String nm;
	int code;
	
	public java(String nm,int code,String name,double version) {
		super(name,version);
		this.nm=nm;
		this.code=code;
	}

}

