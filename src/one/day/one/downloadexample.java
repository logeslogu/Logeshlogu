package one.day.one;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadexample {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ADMIN\\Desktop\\Selenium "
				+ "Webdriver\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0y5b286pk6qlr1omppwra0lth581283.node0");
		driver.manage().window().maximize();
		WebElement fileslist=driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]"));
		fileslist.click();
		File fileslocation =new File("C:\\Users\\ADMIN\\Downloads");
		File[] totalfiles=fileslocation.listFiles();
		for (File file : totalfiles) {
			if(file.getName().equals("TestLeaf Logo3"));
			
			System.out.println("filefound");			break;
					
		}}}
