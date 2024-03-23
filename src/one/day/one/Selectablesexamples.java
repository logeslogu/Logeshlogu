package one.day.one;

import java.util.List;
import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectablesexamples {

	@Test

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ADMIN\\Desktop\\Selenium "
				+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//WebElement new1=driver.findElement(By.id("j_idt87:auto-complete_input"));
		//new1.sendKeys("s");
		//Thread.sleep(10000);  //explicit wait
		List<WebElement> new2= driver.findElements(By.id("//*[@id=\"j_idt87:auto-complete\"]/button/span[1]/li"));
		
				for (WebElement webElement1 : new2) {
			 if(webElement1.getText().equals("AWS"));
			 webElement1.click();
			 break;
			 
			 
			
		}
		
		
		
	
		
		

	}

}
