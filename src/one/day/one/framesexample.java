package one.day.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framesexample {

@Test	

	public void testcase1() {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ADMIN\\Desktop\\Selenium "
				+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement frames1=driver.findElement(By.id("Click"));
		frames1.click();
		String frames3=driver.findElement(By.id("Click")).getText();
		
		System.out.println(frames3);
		
		
		driver.switchTo().defaultContent();
		List<WebElement> total =driver.findElements(By.tagName("iFrame"));
		
		int s1=total.size();
		System.out.println(s1);	
		
		driver.quit();
		
		
		
		
	}

}
