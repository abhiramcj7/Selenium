package Selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listelement {
      ChromeDriver driver;
      
      @Before
      public void setup() {
    	  driver=new ChromeDriver();
    	 // driver.get("https://www.google.co.in/");   
    	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

      }
      
      @Test
      public void test() {
    	  
    	  /*
    	  
    	 List<WebElement> li = driver.findElements(By.tagName("a"));
    	
		 System.out.println(li.size());
    	  for(WebElement temp:li ) {
    		  System.out.println(temp.getText());
    		  System.out.println(temp.getAttribute("href"));  
    		 String link= temp.getAttribute("href");
    		 System.out.println(link);
    		 String text=temp.getText();
    		 System.out.println(text);
    		 
             }*/
    	WebElement e = driver.findElement(By.id("Register"));
    	String str= e.getAttribute("value");
    	System.out.println(str);
    	String act="Create my account >>";
         if(act.equals(str)) {
       	System.out.println("pass");
       }else {
        	System.out.println("fail");
        }
    	  
      }
}
