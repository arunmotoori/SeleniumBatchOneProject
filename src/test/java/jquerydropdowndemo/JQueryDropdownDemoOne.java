package jquerydropdowndemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropdownDemoOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		WebElement singleSelectionDropdown = driver.findElement(By.id("justAnotherInputBox"));
		singleSelectionDropdown.click();
		singleSelectionDropdown.sendKeys("choice 6");
		
		WebElement choice623Option = driver.findElement(By.xpath("//h3[text()='Single Selection']/following::div[3]//li/span[text()='choice 6 2 1']"));
		choice623Option.click();
		
		
	}

}
