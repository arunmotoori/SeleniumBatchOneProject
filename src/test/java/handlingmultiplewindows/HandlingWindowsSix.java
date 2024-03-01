package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsSix {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String omayoWindowId = driver.getWindowHandle();
		
		WebElement selenium143Link = driver.findElement(By.id("selenium143"));
		selenium143Link.click();
		
		WebElement newPopupWindowLink = driver.findElement(By.linkText("Open a popup window"));
		newPopupWindowLink.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		for(String windowId : windowIds) {
			
			if(!windowId.equals(omayoWindowId)) {
				
				driver.switchTo().window(windowId);
				break;
				
			}
			
		}
		
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
