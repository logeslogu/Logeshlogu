package one.day.one;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class draganddrop1 {

	public  void testcase2() {
	System.setProperty("WebDriver.chrome.driver",
			"C:\\Users\\ADMIN\\Desktop\\Selenium "
			+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.leafground.com"
			+ "/drag.xhtml;jsessionid=node0a37j3zpmgbuw1wkzr20caudqe580720.node0");
	driver.manage().window().maximize();
	  
	WebElement Drop1=driver.findElement(By.xpath("//*[@id=\'form:drop_header\']/span"));
	WebElement drag1=driver.findElement(By.xpath("//*[@id=\'form:drag_content\']/p"));
	Actions action =new Actions(driver);
	//action.clickAndHold(drag1).moveToElement(Drop1).release(Drop1).build().perform();
	action.dragAndDrop(drag1, Drop1).build().perform()
	;
	Assert.assertEquals(null, null)
	driver.quit();
	
	}

}
