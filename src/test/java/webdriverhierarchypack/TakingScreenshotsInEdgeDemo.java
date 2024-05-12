package webdriverhierarchypack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshotsInEdgeDemo {

	public static void main(String[] args) throws IOException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("screenshots\\edge1.png"));
		
		driver.quit();
	}

}
