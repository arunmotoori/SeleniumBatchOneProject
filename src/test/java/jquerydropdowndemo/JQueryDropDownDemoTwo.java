package jquerydropdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownDemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		WebElement singleSelectionDropdown = driver.findElement(By.id("justAnotherInputBox"));
		singleSelectionDropdown.click();
		
		WebElement singleChice3Option = driver.findElement(By.xpath("(//span[text()='choice 3'])[3]"));
		singleChice3Option.click();
		
		
		
	}

}
