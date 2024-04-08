package multiselectionboxfielddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectCommandsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiSelectionBoxField);
		
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Swift");
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		
		select.deselectAll();
		
		/*
		 * select.deselectByVisibleText("Swift"); 
		 * select.deselectByIndex(2);
		 * select.deselectByValue("audix");
		 */
		
	}

}
