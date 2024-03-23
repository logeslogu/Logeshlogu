package one.day.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarsexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ADMIN\\Desktop\\Selenium "
				+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.leafground.com/calendar.xhtml");		
		driver.manage().window().maximize();

		//*[@id="j_idt87:from"]
	}

}
