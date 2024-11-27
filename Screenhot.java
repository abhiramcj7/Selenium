package Selenium;

import org.junit.Test;
import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenhot {
	 ChromeDriver driver;
@Before
public void setup() {
	driver=new ChromeDriver();
	//driver.get("https://register.rediff.com/register/register.php?FormName=user_detail");
	driver.get("https://www.facebook.com/");}
@Test
public void test() throws IOException {
	//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileHandler.copy(src, new File("D:\\683741.jpg"));
/*	WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[1]"));
	File src1=element.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, new File("./Screenshot//element1.png "));
*/
	WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]"));
	File src1=element.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, new File("./Screenshot//element2.png "));
	
	
}
}