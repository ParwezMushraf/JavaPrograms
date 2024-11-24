package string_programs;

public class sum_digit_String {
	public static int call(char ch) {
		switch (ch) {
		case '0':{
			return 0;
		}
		case '1':{
			return 1;
		}
		case '2':{
			return 2;
		}
		case '3':{
			return 3;
		}
		case '4':{
			return 4;
		}
		case '5':{
			return 5;
		}
		case '6':{
			return 6;
		}
		case '7':{
			return 7;
		}case '8':{
			return 8;
		}case '9':{
			return 9;
		}
		}
			return ch;
		}
		
	public static void main(String[] args) {
		String s1="3818";
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++) {
		  char ch=s1.charAt(i);
		  if(ch>='0'&&ch<='9') {
			  sum=sum+call(ch);
		  }
		}
		 System.out.println(sum);
	}
}
