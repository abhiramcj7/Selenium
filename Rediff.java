package Selenium;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
  
@Before
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");;
}

@Test
public void Test() {
	boolean b=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
	System.out.println(b);
	if(b==true) {
		System.out.println("test pass");
	}else {
		System.out.println("test fail");
	}
	boolean b1=driver.findElement(By.xpath("//input[@value='m']")).isSelected();
	if(b1==true) {
		System.out.println("test pass");
	}else {
		System.out.println("test fail");
	}
	boolean b2=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
	if(b2==true) {
		System.out.println("test pass");
	}else {
		System.out.println("test fail");
	}
}
}
