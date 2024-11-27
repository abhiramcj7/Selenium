package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statuscode {
	ChromeDriver driver;
	String baseurl="https://www.google.com/";
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() throws IOException  {
	  URL ob= new URL(baseurl);
	  HttpURLConnection con=(HttpURLConnection)ob.openConnection(); //TYPECASTING
	 List <WebElement> li= driver.findElements(By.tagName("a"));
	 for(WebElement temp:li) {
		 System.out.println(temp.getAttribute("href"));
		 con.connect();
		  if(con.getResponseCode()==200) {
			  System.out.println("valid");
		  }else {
			  System.out.println("invalid");
		  }
	 }
	  
	}
}
