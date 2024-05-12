package webdriverhierarchypack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//FirefoxDriver driver = new FirefoxDriver();
		//RemoteWebDriver driver = new FirefoxDriver();
		//ChromiumDriver driver = new FirefoxDriver(); - Not Possible
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
//		File srcFile = driver.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(srcFile,new File("screenshots\\firefox2.png"));
		
//		JavascriptExecutor jsDriver = (JavascriptExecutor)driver;
//		jsDriver.executeScript("alert('Hi There!Arun Here!')");
		
		((JavascriptExecutor)driver).executeScript("alert('Hi There!Arun Here!')");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
