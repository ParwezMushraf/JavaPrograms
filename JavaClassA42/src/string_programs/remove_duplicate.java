package string_programs;

public class remove_duplicate {

	public static void main(String[] args) {
		String s1="ahamad";
		String s2="";
		char ch[]=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					count ++;                 
				}
			}
			if(count<1) {
				s2=s2+ch[i];
				
			}
			}
		System.out.println(s2);

	}

}
