package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {
      ChromeDriver driver;
      @Before
      public void Test() {
    	  driver=new ChromeDriver();
    	  driver.get("https://blazedemo.com/register");
      }
      @Test
      public void test() {
    	  driver.findElement(By.id("name")).sendKeys("unni");
    	  driver.findElement(By.name("company")).sendKeys("TCS");
    	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("unnicr@gmail.com");
    	  driver.findElement(By.id("password")).sendKeys("12345");
    	  driver.findElement(By.id("password-confirm")).sendKeys("12345");
    	  //driver.findElement(By.xpath("//*[contains(text()='Register')")).click();
    	  driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
      }
      
}
