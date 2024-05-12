package webdriverhierarchypack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EdgeDriverDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//EdgeDriver driver = new EdgeDriver();
		//ChromiumDriver driver = new EdgeDriver();
		RemoteWebDriver driver = new EdgeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("screenshots\\edge2.png"));
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
