package takingscreenshotsdemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakingScreenshotsOfIssueAreaDemo {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement doubleClickLink = driver.findElement(By.id("testdoubleclick"));

		Actions actions = new Actions(driver);
		actions.doubleClick(doubleClickLink).perform();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement facebookOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", facebookOption);
		
		jse.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", facebookOption);
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("screenshots\\issueScreenshot.png"));
		
		driver.quit();
	
	}

}
