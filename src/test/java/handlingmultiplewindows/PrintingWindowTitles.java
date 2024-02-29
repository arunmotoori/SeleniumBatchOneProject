package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingWindowTitles {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
		WebElement popupWindowLink = driver.findElement(By.linkText("Open a popup window"));
		popupWindowLink.click();
		
		WebElement bloggerWindowLink = driver.findElement(By.linkText("Blogger"));
		bloggerWindowLink.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		for(String windowId : windowIds) {
			
			driver.switchTo().window(windowId);
			
			String windowTitle = driver.getTitle();
			
			System.out.println(windowTitle);
			
			
		}
		
		driver.quit();

	}

}
