package constructoroverloading;

public class Driver1 {

	public static void main(String[] args) {
		consoverload c2=new consoverload();
		consoverload c=new consoverload("ali",22);
		System.out.println(c.name);
		System.out.println(c.age);
		consoverload c1=new consoverload("ali",10,12234589);
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.ph_no);

	}

}
