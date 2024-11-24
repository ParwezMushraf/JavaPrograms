package file_handling;

import java.io.File;
import java.io.IOException;

public class Task {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Shaik Ahamad Alisha\\OneDrive\\Desktop\\filehandling\\sample.txt");
         try {
        	 boolean flag=f.createNewFile();
        	 System.out.println(flag);
         }
         catch(IOException e) {
        	 String s1=e.getMessage();
        	 System.out.println(s1);
         }
	}

}
