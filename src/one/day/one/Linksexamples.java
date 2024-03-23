package one.day.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Linksexamples {
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ADMIN\\Desktop\\Selenium "
				+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		//
		WebElement linktext1=driver.findElement(By.linkText("Go to Dashboard"));
		linktext1.click();
		driver.navigate().back();
		
		//
		WebElement linktext2=driver.findElement(By.partialLinkText("Find the URL without clickin"));
		String s1=linktext2.getAttribute("href");
		System.out.println("this link is going to "+ s1);
		
		//
		WebElement Linktext4 =driver.findElement(By.linkText("Broken?"));
		Linktext4.click();
		String Title =driver.getTitle();	
		if (Title.contains("404"));
		{
			System.out.println("Broken link found");		
			
		}		
		driver.navigate().back();
		
		//
		WebElement linktext5=driver.findElement(By.linkText("Go to Dashboard"));
		linktext5.click();
		driver.navigate().refresh();
		Thread.sleep(10000);
		
		
		driver.navigate().back();
		//
		List<WebElement> linktext3=driver.findElements(By.tagName("a"));
		int totallinks =linktext3.size();
		System.out.println(totallinks);
		
		//
		
		

	}

}
