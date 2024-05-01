package takingscreenshotsdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingFullScreenshotOfPageDemo {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		File srcFile = driver.getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("screenshots\\full.png"));
		
		driver.quit();

	}

}
