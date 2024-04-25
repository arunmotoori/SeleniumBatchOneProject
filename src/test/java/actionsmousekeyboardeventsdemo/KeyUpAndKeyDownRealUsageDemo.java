package actionsmousekeyboardeventsdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDownRealUsageDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement compendiumDevLink = driver.findElement(By.linkText("compendiumdev"));
		WebElement onlyTestingBlogLink = driver.findElement(By.linkText("onlytestingblog"));
		WebElement testWiselyLink = driver.findElement(By.linkText("testwisely"));
		WebElement jqueryuiLink = driver.findElement(By.linkText("jqueryui"));
		WebElement theautomatedtesterLink = driver.findElement(By.linkText("theautomatedtester"));
		
		
		actions.pause(Duration.ofSeconds(2))
		.keyDown(Keys.CONTROL).click(compendiumDevLink).keyUp(Keys.CONTROL)
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.CONTROL).click(onlyTestingBlogLink).keyUp(Keys.CONTROL)
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.CONTROL).click(testWiselyLink).keyUp(Keys.CONTROL)
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.CONTROL).click(jqueryuiLink).keyUp(Keys.CONTROL)
		.pause(Duration.ofSeconds(2))
		.keyDown(Keys.CONTROL).click(theautomatedtesterLink).keyUp(Keys.CONTROL)
		.build().perform();
		

	}

}
