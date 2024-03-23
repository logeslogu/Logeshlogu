package one.day.one;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadexample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ADMIN\\Desktop\\Selenium "
				+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0y5b286pk6qlr1omppwra0lth581283.node0");
		driver.manage().window().maximize();
		WebElement fileslist=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
		fileslist.click();
		//C:\Users\ADMIN\\Downloads\\TestLeaf Logo.PNG 
		StringSelection selection =new StringSelection("C:\\Users\\ADMIN\\Downloads\\983547-ClaimForm.pdf ");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER)	;	
	}

}
