package one.day.one;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class Windowshandling {
 
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.chrome.driver",
			"C:\\Users\\ADMIN\\Desktop\\Selenium "
			+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.leafground.com/window.xhtml");
	driver.manage().window().maximize();

String s1=driver.getWindowHandle();
WebElement windowsexample=driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
windowsexample.click();


Set<String> handles =driver.getWindowHandles(); 

for (String newwindow : handles) {
	driver.switchTo().window(newwindow);
	
}
WebElement windowsexample1=driver.findElement(By.xpath("//*[@id=\"productsTable:j_idt204\"]/span[1]"));
windowsexample1.click();
	Thread.sleep(10000);
driver.close();
Thread.sleep(10000);
driver.switchTo().window(s1);
WebElement openmulitiple =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
openmulitiple.click();
Thread.sleep(10000);
int s2=driver.getWindowHandles().size();
System.out.println(s2);

WebElement openmulitiple1=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
openmulitiple1.click();

Thread.sleep(10000);
Set <String> allwindows=driver.getWindowHandles();

for (String allwindows1 : allwindows) {
	
	if (!allwindows1.equals(s1)
			)
			{
		driver.switchTo().window(allwindows1);
		
		
		driver.close();
		
		
			}
	
}







	}

}
