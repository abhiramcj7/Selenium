package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String s=driver.getPageSource();
		if(s.contains("Gmail")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

	}

}
