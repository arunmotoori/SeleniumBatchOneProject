package javascriptexecutordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTextIntoFieldsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		WebElement searchBoxField = driver.findElement(By.name("q"));
		//textAreaField.sendKeys("Arun Motoori");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value='Arun Motoori'",textAreaField,searchBoxField);
	}

}
