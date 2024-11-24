package BrowserLaunching;


import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to create a Chrome");
		System.out.println("Enter 2 to Create a Edge");
		System.out.println("Enter 3 to Create a Firefox");
		int no=sc.nextInt();
		switch(no){
		case 1:{
			new ChromeDriver();
		}break;
		case 2:{
			 new EdgeDriver();
		}break;
		case 3:{
			new FirefoxDriver();
		}break;
		default:{
			System.out.println("Give with in the 3 Numbers :)");
		}break;
		}
         System.out.println("Thank you :)");
	}

}

