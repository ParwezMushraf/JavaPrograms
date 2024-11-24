package Number;

public class satellite {
	
		String name="EOS-04";
		 int SATCAT_no=51656;
		 public void mass()
		 {
			 System.out.println(name);
			 System.out.println("mass");
			 System.out.println("weight");
			 System.out.println("components");
		 }
		 public void observation()
		 {
			System.out.println(name);
			System.out.println(SATCAT_no);
			System.out.println("observation");
			System.out.println("high quality images");
		 }
		 public static void main(String []args)
		 {
			 satellite s1=new satellite();
			 System.out.println(s1.name);
			 System.out.println(s1.SATCAT_no);
			 s1.mass();
			 s1.observation();
		 }
	}

