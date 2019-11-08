package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class TravelDomain {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\selvakumar\\eclipse-workspace\\AirlineDomain\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jetcost.co.in/en");
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 WebElement from = driver.findElement(By.xpath("//input[@id='originFrom']"));
			
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].SetAttribute('value', 'chennai')", from);
		  

		//WebElement from = driver.findElement(By.xpath("//input[@id='originFrom']"));
		
		//  from.sendKeys("chennai");
		  
		 
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		 
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  WebElement e = driver.findElement(By.id("originTo"));
		  e.sendKeys("Goa - Dabolim India");

		/*
		 *
		 * 
		 */

		
		/*
		 * driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); WebElement
		 * to = driver.findElement(By.id("originTo"));
		 * to.sendKeys("Goa - Dabolim, India");
		 * 
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 */
		  
		/*
		 * WebElement click1 = driver.findElement(By.
		 * xpath("//span[@class='flatpickr-day selected startRange']")); click1.click();
		 */
		  
		/*
		 * WebElement search = driver.findElement(By.
		 * xpath("//button[@class='btn btn-cta btn-block form-search-btn flights-form-search-cta-btn input-lg']"
		 * )); search.click();
		 */
		 
	}

}
