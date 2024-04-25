package actionsmousekeyboardeventsdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NigoraCodeForCopyPastingTextDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement searchBoxField = driver.findElement(By.name("search"));
		searchBoxField.sendKeys("Privet");
		
		Thread.sleep(2000);
		
		WebElement macBoxText = driver.findElement(By.xpath("//p[contains(normalize-space(),'Intel Core 2 Duo processor')]"));
		
		Actions actions = new Actions(driver);
		actions.doubleClick(macBoxText).click()
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
		.build().perform();
		
		searchBoxField.clear();
		
		actions.click(searchBoxField)
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		.build().perform();
		
		Thread.sleep(2000);
	
	}

}
