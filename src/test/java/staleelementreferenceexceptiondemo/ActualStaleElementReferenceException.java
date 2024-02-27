package staleelementreferenceexceptiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActualStaleElementReferenceException {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		WebElement selenium143Link = driver.findElement(By.id("link1"));
		selenium143Link.click();
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.navigate().back();
		
		//driver.navigate().refresh();
		
		textAreaField = driver.findElement(By.id("ta1"));
		
		textAreaField.sendKeys("Varun Dhawath");
		
		
	}

}
