package string_programs;

public class String_splchar {

	public static void main(String[] args) {
		String s1="jav a @#$13";
		 
		for(int i=0;i<=s1.length()-1;i++)
		{ 
			char ch=s1.charAt(i);                                                                                                                                                                    
			if(!(ch>='A'&&ch<='Z')
			&&!(ch>='a'&&ch<='z')
			&&!(ch>='0'&&ch<='9')&& ch!=' ') 
			{
				System.out.println(ch);                                            
      }	
	}
  }
}
