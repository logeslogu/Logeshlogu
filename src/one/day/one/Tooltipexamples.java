package one.day.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltipexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ADMIN\\Desktop\\Selenium "
				+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		WebElement tooltipexampls=driver.findElement(By.id("tooltip"));
		
		String s1= tooltipexampls.getAttribute("Title");
		System.out.println(s1);
		driver.quit();
		
		
	}

}
