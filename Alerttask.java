package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttask {
 ChromeDriver driver;
 @Before
 public void setup() {
	 driver=new ChromeDriver();
	 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
 }
 @Test
 public void Test()  {
	
	 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/button[1]")).click();
	 driver.switchTo().alert().accept();
	 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/button[1]")).click();
	 driver.switchTo().alert().dismiss();
	 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/button[1]")).click();
	 driver.switchTo().alert().sendKeys("123");
	 driver.switchTo().alert().accept();
	
	 
	
	
 }
}
