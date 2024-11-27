package Selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
           ChromeDriver driver;
           

@Before

public void Setup() {
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");  
   
    
    
}

@Test

public void Test() {
	   WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
	   Select select=new Select(day);
	   select.selectByValue("12");
	   List<WebElement> list=select.getOptions();
	   System.out.println(list.size());
	   
	  /*  WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
	    Select select1=new Select(month);
	   // select1.selectByVisibleText("JAN");
	    select1.selectByValue("01");
	    WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
	    Select select2=new Select(year);
	    //select2.selectByIndex(4);
	   // select2.selectByValue("2024");
	    select2.selectByVisibleText("2023");
	    */
}
}