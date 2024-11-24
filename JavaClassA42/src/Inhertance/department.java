package Inhertance;

public class department extends college {

	public static void main(String[] args) {
		department d=new department();
		System.out.println(d.uni_name);
		System.out.println(d.uni_code);
		teach();
		conduct_external_exams();

	}

}
