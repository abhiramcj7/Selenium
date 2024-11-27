package Selenium;


import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setup() {
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}

	@Test
	public void test() {	
		String s=driver.getTitle();
		System.out.println(s);
		String exp="Google";
		if(s.equals(exp)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
	@Test
	public void test1() {
		String content=driver.getPageSource();
		if(content.contains("Gmail")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
	@Test
	public void test2() {
		driver.findElement(By.name("q")).sendKeys("cristiano",Keys.ENTER);
		
	}
	
   @After
	public void close() {
		System.out.println("close");
		//driver.close();
	}
	
	

}
