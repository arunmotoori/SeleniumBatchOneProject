package framesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingByLocatorDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		By byTextAreaFieldLocator = By.id("ta1");
		WebElement textAreaField = driver.findElement(byTextAreaFieldLocator);
		textAreaField.sendKeys("Arun Motoori");
		
		/*
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		 */
		

	}

}
