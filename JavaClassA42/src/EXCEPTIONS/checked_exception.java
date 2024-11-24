package EXCEPTIONS;

import java.io.File;
import java.io.IOException;

public class checked_exception {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Shaik Ahamad Alisha\\OneDrive\\Desktop\\Exception\\checked_exception.class");
          System.out.println(f.createNewFile());
	}

}
