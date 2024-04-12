package jquerydropdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropdownDemoThree {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		WebElement singleDropdownField = driver.findElement(By.id("justAnotherInputBox"));
		singleDropdownField.click();
		singleDropdownField.sendKeys("choice 2");
		singleDropdownField.sendKeys(Keys.ARROW_DOWN);
		singleDropdownField.sendKeys(Keys.ARROW_DOWN);
		singleDropdownField.sendKeys(Keys.ARROW_DOWN);
		singleDropdownField.sendKeys(Keys.ARROW_DOWN);
		singleDropdownField.sendKeys(Keys.ENTER);
	}

}
