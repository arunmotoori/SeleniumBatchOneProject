package javascriptexecutordemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HighlightAndTakeScreenshotsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		highLightAndTakeScreenshot(driver,textAreaField);
		
		driver.quit();

	}
	
	public static void highLightAndTakeScreenshot(ChromeDriver driver,WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border='2px solid red';", element);
		Thread.sleep(1000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src,new File("screenshots\\ta.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		jse.executeScript("arguments[0].style.border='';", element);
	}

}
