package doubtsthree;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemeOne {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE);	
		String filePath = System.getProperty("user.dir")+"\\screenshot1.png";
		FileHandler.copy(srcFile,new File(filePath));
		
		driver.quit();

	}

}
