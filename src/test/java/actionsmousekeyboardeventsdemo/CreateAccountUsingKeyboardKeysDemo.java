package actionsmousekeyboardeventsdemo;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * We have used the below code in the script for highlighting active elements:
 * Example Code":
 * jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
			Thread.sleep(200);
			jse.executeScript("document.activeElement.setAttribute('style', '');");
 */


public class CreateAccountUsingKeyboardKeysDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Actions actions = new Actions(driver);
		for(int i=1;i<=23;i++) {
			actions.sendKeys(Keys.TAB).pause(Duration.ofMillis(200)).build().perform();
			jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
			Thread.sleep(200);
			jse.executeScript("document.activeElement.setAttribute('style', '');");
		}
		
		actions.sendKeys("Arun").pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(Keys.TAB).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys("Motoori").pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(Keys.TAB).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(generateNewEmail()).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(Keys.TAB).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys("1234567890").pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(Keys.TAB).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys("12345").pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(Keys.TAB).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys("12345").pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(Keys.TAB).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(Keys.ARROW_LEFT).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(Keys.TAB).pause(Duration.ofMillis(400)).sendKeys(Keys.TAB).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");		
		actions.sendKeys(Keys.SPACE).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");		
		actions.sendKeys(Keys.TAB).pause(Duration.ofMillis(400)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");
		actions.sendKeys(Keys.ENTER).pause(Duration.ofSeconds(1)).build().perform();
		jse.executeScript("document.activeElement.setAttribute('style', 'background: yellow; border: 2px solid red');");
		Thread.sleep(200);
		jse.executeScript("document.activeElement.setAttribute('style', '');");		
		
		driver.quit();
		
	}
	
	public static String generateNewEmail() {
		
		Date date = new Date();
		String newEmail = date.toString().replace(" ","_").replace(":","_").concat("@gmail.com");
		return newEmail;

	}
	
	

}
