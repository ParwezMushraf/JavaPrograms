package string_programs;

public class duplicate_char {

	public static void main(String[] args) {
	String s1="ahamad";
	char ch[]=s1.toCharArray();
	for(int i=0;i<=ch.length-1;i++) {
		int count=0;
		for(int j=0;j<i;j++) {
			if(ch[i]==ch[j]) {
				count ++;
			}
		}
		if(count==1) {
			System.out.println(ch[i]);
		}
		}
	}

}


