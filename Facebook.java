package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;



public class Facebook {

	public static void main(String[] args) {
		ChromeDriver dv=new ChromeDriver();
		dv.get("https://www.facebook.com/");
		 String act=dv.getTitle();
		 System.out.println(act);
		 String exp="Facebook – log in or sign up";
		 if(act.equals(exp)) {
			 System.out.println("passed");
		 }else {
			 System.out.println("fail");
		 }
		 String s=dv.getPageSource();
		 if(s.contains("Log in")) {
			 System.out.println("pass");
		 }else {
			 System.out.println("fail");
		 } 

	}

}
