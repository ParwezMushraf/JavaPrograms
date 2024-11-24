package constructor_chaining;

public class python extends java{
	String n;
	String program;
	
	public python(String n,String program,String nm,int code,String name,double version) {
		super(nm,code,name,version);
		this.n=n;
		this.program=program;
	}

	public static void main(String[] args) {
		python p=new python("python","happy_number","java",123,"c",1.0);
		System.out.println(p.n);
		System.out.println(p.program);
		System.out.println(p.nm);
		System.out.println(p.code);
		System.out.println(p.name);
		System.out.println(p.version);

	}

}












 
