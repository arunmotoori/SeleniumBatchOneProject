package takingscreenshotsdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AnotherWayToTakeScreenshotDemo {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
//		File srcFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(srcFile1,new File("screenshots\\newImage.png"));
		
		//The below getScreenshotAs() method will not work when Driver object
		//is assigned to WebDriver interface.
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("screenshots\\newImage.png"));
		
		driver.quit();

	}

}
