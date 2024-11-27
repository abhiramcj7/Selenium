package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assisgn {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("abhiram");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("abhi@gmail.com");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("12345");
		
		
		
		
		
		
		//Amazon test cases
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile",Keys.ENTER);
		//driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
	    //driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhiramchalil232@gmail.com",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@id='continue']")).click();
		//driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();

	}

}
