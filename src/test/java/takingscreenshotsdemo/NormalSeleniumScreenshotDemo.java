package takingscreenshotsdemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NormalSeleniumScreenshotDemo {

	public static void main(String[] args) throws IOException, InterruptedException  {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("screenshots\\"+"IHeroku.png"));
		
		WebElement jsAlertsLink = driver.findElement(By.linkText("JavaScript Alerts"));
		jsAlertsLink.click();
		
		WebElement alertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		alertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(3000);
		
		File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile2,new File("screenshots\\alertScreenshot.png"));
		
		driver.quit();
	
	}

}
