package takingscreenshotsdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SectionScreenshotDemo {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement section = driver.findElement(By.id("LinkList1"));
		File srcFile = section.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("screenshots\\section.png"));
		
		driver.quit();
		
	}

}
