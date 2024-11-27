package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		ChromeDriver dv=new ChromeDriver();
		dv.get("https://www.netflix.com/in/");
		String actualtittle=dv.getTitle();
		System.out.println(actualtittle);
		String expectittle="Netflix India – Watch TV Shows Online, Watch Movies Online";
		if(actualtittle.equals(expectittle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
