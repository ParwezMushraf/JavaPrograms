package hirarical_Inhertance;

public class axis extends bank{
	int branch_code=11315;
	int r_interest=4;
	
	public static void axis() {
		System.out.println("rate of interest is 4rs");
	}
	public static void main(String[] args) {
		axis a=new axis();
		System.out.println(a.name);
		System.out.println(a.type);
		a.Bank();
		System.out.println(a.branch_code);
		System.out.println(a.r_interest);
		a.axis();
		}
	}
 