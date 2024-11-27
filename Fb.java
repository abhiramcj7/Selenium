package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//*[contains(@name,'em')]")).sendKeys("123");
		//List<WebElement> li = driver.findElements(By.tagName("a"));
		//System.out.println(li.size());
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("123@gmail.com");
		//driver.findElement(By.xpath("//input[@ name='email']")).sendKeys("xyz@gmail.com");
		//driver.findElement(By.xpath("//input [@name='pass']")).sendKeys("qweet123");
		
		//driver.findElement(By.xpath("//button [@name='login']")).click();
	}  

}
