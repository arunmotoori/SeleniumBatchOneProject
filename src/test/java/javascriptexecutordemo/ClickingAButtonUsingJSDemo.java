package javascriptexecutordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingAButtonUsingJSDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/*
		WebElement alertButton = driver.findElement(By.id("alert1"));
		alertButton.click();
		*/
		
		//WebElement alertButton = driver.findElement(By.id("alert1"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].click()",alertButton);
		jse.executeScript("document.getElementById('alert1').click()");
		

	}

}
