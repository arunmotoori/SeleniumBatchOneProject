package actionsmousekeyboardeventsdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryRickClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickMeButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		/*
		Actions actions = new Actions(driver);
		actions.contextClick(rightClickMeButton).pause(Duration.ofSeconds(2))
		.sendKeys(Keys.ARROW_DOWN).pause(Duration.ofSeconds(2))
		.sendKeys(Keys.ARROW_DOWN).pause(Duration.ofSeconds(2))
		.sendKeys(Keys.ARROW_DOWN).pause(Duration.ofSeconds(2))
		.sendKeys(Keys.ENTER).pause(Duration.ofSeconds(2))
		.build().perform();
		*/
		
		Actions actions = new Actions(driver);
		actions.contextClick(rightClickMeButton).perform();
		for(int i=1;i<=5;i++)
			actions.sendKeys(Keys.ARROW_DOWN).pause(Duration.ofSeconds(2)).build().perform();
		actions.sendKeys(Keys.ENTER).pause(Duration.ofSeconds(2)).perform();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
		Thread.sleep(2000);
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		WebElement pageHeading = driver.findElement(By.id("demo-simple-context-menu"));
		String pageHeadingText = pageHeading.getText();
		System.out.println(pageHeadingText);
		
		driver.quit();
		
	}

}
