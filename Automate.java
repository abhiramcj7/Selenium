package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {

	public static void main(String[] args) {
	    WebDriver dv=new ChromeDriver();
		dv.get("https://www.google.co.in/");
		dv.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		//dv.findElement(By.name("btnK")).click();

	}

}
