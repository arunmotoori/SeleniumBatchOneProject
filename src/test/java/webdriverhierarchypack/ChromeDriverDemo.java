package webdriverhierarchypack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		//ChromiumDriver driver = new ChromeDriver();
		//RemoteWebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//SearchContext driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
//		TakesScreenshot tsDriver = (TakesScreenshot)driver;
//		File srcFile = tsDriver.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(srcFile,new File("screenshots\\chrome3.png"));
		
		//driver = (WebDriver)tsDriver;
		
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(srcFile,new File("screenshots\\chrome4.png"));
		
//		File srcFile = driver.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(srcFile,new File("screenshots\\chrome2.png"));
		
		Thread.sleep(3000);
		
		driver.executeScript("alert('Hi There! Arun Here');");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
