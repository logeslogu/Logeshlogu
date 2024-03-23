package one.day.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sorttablesexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ADMIN\\Desktop\\Selenium "
				+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/list.xhtml");
		
		driver.manage().window().maximize();

		WebElement  linktext1=driver.findElement(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li[3]"));
		WebElement linktext2=driver.findElement(By.xpath("//*[@id=\"pickList\"]/div[4]/ul"));
		Actions action=new Actions(driver);			
		action.clickAndHold(linktext1);
		action.moveToElement(linktext2);
		action.release(linktext2);
		action.build().perform();		
		
		
		
	}

}
