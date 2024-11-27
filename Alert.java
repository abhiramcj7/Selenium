package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
ChromeDriver driver;

@Before
public void setup() {
	driver=new ChromeDriver();
	driver.get("file:///E:/alert.html");
}

@Test
public void test() {
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	//driver.switchTo().alert().accept();
      org.openqa.selenium.Alert a= driver.switchTo().alert();
     String act=a.getText();
     System.out.println(act);
      a.accept();
    driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Abhiram");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
}
}
