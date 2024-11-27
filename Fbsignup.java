package Selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Fbsignup {

ChromeDriver driver;
 
@Before
public void Before() {
	driver=new ChromeDriver();
	driver.get("https://upload.facebook.com/reg/");
}
@Test
public void Test() {
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	Select days=new Select(day);
	days.selectByValue("31");
	List<WebElement> li=days.getOptions();
    System.out.println(li.size());
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select months=new Select(month);
	months.selectByIndex(4);
	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	Select years=new Select(year);
	years.selectByVisibleText("2021");
	
	
}
}
