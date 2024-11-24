package hirarical_Inhertance;

public class sbi extends bank{
	String branch="kukkatpally";
	int rate_of_interest=2;
	
	public static void loan() {
		System.out.println("bank provides interest at 2rs");
	}

	public static void main(String[] args) {
		sbi s=new sbi ();
		System.out.println(s.name);
		System.out.println(s.type);
		s.Bank();
		System.out.println(s.branch);
		System.out.println(s.rate_of_interest);
		s.loan();

	}

}
