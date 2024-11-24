package EXCEPTIONS;

public class THROWS {

	public static void main(String[] args) throws InterruptedException{
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			Thread.sleep(100);
		}

	}

}
