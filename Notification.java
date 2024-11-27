package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Notification {
	 static ChromeDriver driver;
	
	@Before
	public static void setup() {
		driver=new ChromeDriver();
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver=new ChromeDriver();
		
	}
	@Test
	public static void  url() {

	driver.get("https://www.justdial.com/");
	}
}

