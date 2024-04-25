package actionsmousekeyboardeventsdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TutorialsNinjaKeyboardKeysDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		
		WebElement loginOption = driver.findElement(By.linkText("Login"));
		loginOption.click();
		
		WebElement emailAddressField = driver.findElement(By.id("input-email"));
		emailAddressField.sendKeys("amotooricap3@gmail.com");
		
		/*
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");
		passwordField.sendKeys(Keys.ENTER);
		*/
	
		Actions actions = new Actions(driver);
		
		actions.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("12345")
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys(Keys.ENTER)
		.build().perform();
		
		
		/*
		Actions actions = new Actions(driver);
		
		actions.pause(Duration.ofSeconds(2))
		.keyDown(Keys.TAB).keyUp(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("12345")
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.TAB).keyUp(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.TAB).keyUp(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.ENTER).keyUp(Keys.ENTER)
		.build().perform();
		*/
	}

}
