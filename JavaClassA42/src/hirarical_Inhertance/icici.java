package hirarical_Inhertance;

public class icici extends bank {
	String ifsc_code="SBIN0011315";
	int rate_interest=3;
	
	public static void icici() {
		System.out.println("rate of interest is 3rs ");
		}

	public static void main(String[] args) {
		icici i=new icici();
		System.out.println(i.name);
		System.out.println(i.type);
		i.Bank();
		System.out.println(i.ifsc_code);
		System.out.println(i.rate_interest);
		i.icici();
		

	}

}
