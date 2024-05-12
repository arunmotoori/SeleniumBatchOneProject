package javascriptexecutordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayAlertsDuringScriptExecutionDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		WebElement searchBoxField = driver.findElement(By.name("q"));
		searchBoxField.sendKeys("Arun");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("alert('Test Completed!');");
		
	}

}
