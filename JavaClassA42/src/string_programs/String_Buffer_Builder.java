package string_programs;

public class String_Buffer_Builder {

	public static void main(String[] args) {
	
				System.out.println("StrinBuffer");
				System.out.println("---------------");
				long st=System.nanoTime();
				StringBuffer sb=new StringBuffer ("Synchronized");
				StringBuffer sb1=new StringBuffer("");
				for(int i=sb.length()-1;i>=0;i--) {
					sb1=sb1.append(sb.charAt(i));
				}
				System.out.println(sb1);
				long ed=System.nanoTime();
				System.out.println(ed-st);
				System.out.println("            ");
				System.out.println("StringBuilder");
				System.out.println("------------------");
				long st1=System.nanoTime();
				StringBuilder s1=new StringBuilder("Synchronized");
				StringBuilder s2=new StringBuilder("");
				for(int i=s1.length()-1;i>=0;i--) {
					s2=s2.append(s1.charAt(i));
				}
				System.out.println(s2);
				long ed1=System.nanoTime();
				System.out.println(ed1-st1);
				
			}

	}


