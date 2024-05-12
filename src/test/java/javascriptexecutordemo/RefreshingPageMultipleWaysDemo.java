package javascriptexecutordemo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshingPageMultipleWaysDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		Thread.sleep(2000);
		
		//driver.navigate().refresh();
		
		//The below is not working - Ignore
//		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.F5).perform();
		
		//driver.get(driver.getCurrentUrl());
		
		driver.navigate().to(driver.getCurrentUrl());
		
//		Robot r= new Robot();
//		r.keyPress(KeyEvent.VK_F5);
//		r.keyRelease(KeyEvent.VK_F5);
		
//		//The below is not working. Ignore
//		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.F5).keyUp(Keys.F5).build().perform();
		
//		Actions actions= new Actions(driver);
//		actions.keyDown(Keys.CONTROL).sendKeys("r").keyUp(Keys.CONTROL)
//		.build().perform();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("history.go(0)");
		jse.executeScript("location.reload()");
		
		

	}

}
