package handlingcalendersdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSimpleCalenderOneDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.click();
		
		WebElement currentMonthElement = driver.findElement(By.className("ui-datepicker-month"));
		String currentMonth = currentMonthElement.getText();
		
		WebElement currentYearElement = driver.findElement(By.className("ui-datepicker-year"));
		String currentYear = currentYearElement.getText();
	
		String expectedMonth = "March";
		String expectedYear = "2025";
		String expectedDate = "29";
		
		while(!(currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear))){
			
			WebElement nextOption = driver.findElement(By.xpath("//span[text()='Next']"));
			nextOption.click();
			
			currentMonthElement = driver.findElement(By.className("ui-datepicker-month"));
			currentMonth = currentMonthElement.getText();
			currentYearElement = driver.findElement(By.className("ui-datepicker-year"));
			currentYear = currentYearElement.getText();
		}
		
		String xpathText = "//td[@*='selectDay']/a[text()='"+expectedDate+"']";
		WebElement date = driver.findElement(By.xpath(xpathText));
		date.click();
		
	}

}
