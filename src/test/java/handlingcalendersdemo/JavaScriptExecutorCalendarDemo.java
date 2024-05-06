package handlingcalendersdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorCalendarDemo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		WebElement dateField = driver.findElement(By.id("datepicker"));
		
		/*
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='05/17/2028'",dateField);
		*/
		
		dateField.sendKeys("05/17/2028");
		dateField.sendKeys(Keys.ENTER);
//		WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Calendar Handle')]"));
//		heading.click();
		
	}

}
