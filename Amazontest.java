package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontest {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https:www.amazon.in");
		
	}
	@Test
	public void Test() {
		driver.findElement(By.xpath("//div[@ id='nav-xshop']/a[4]")).click();
	}
	@After
	public void end() {
		System.out.println("end");
	}

}
