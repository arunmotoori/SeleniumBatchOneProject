package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsThree {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String omayoWindowId = driver.getWindowHandle();
		
		WebElement popupWindowLink = driver.findElement(By.linkText("Open a popup window"));
		popupWindowLink.click();
		
		Set<String> twoWindowIds = driver.getWindowHandles();
		
		String popupWindowId = null;
		
		for(String w : twoWindowIds) {
			
			if(!w.equals(omayoWindowId)) {
				
				popupWindowId = w;
				break;
				
			}
			
		}
		
		WebElement bloggerLink = driver.findElement(By.linkText("Blogger"));
		bloggerLink.click();
		
		Set<String> threeWindowIds = driver.getWindowHandles();
		
		String bloggerWindowId = null;
		
		for(String windowId : threeWindowIds) {
			
			if(!(windowId.equals(omayoWindowId) || windowId.equals(popupWindowId))) {
				
				bloggerWindowId = windowId;
				break;
				
			}
			
		}
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		Thread.sleep(3000);
		
		driver.switchTo().window(popupWindowId);
		
		driver.manage().window().maximize();
		
		WebElement popupWindowHeading = driver.findElement(By.xpath("//h3"));
		String popupWindowHeadingText = popupWindowHeading.getText();
		System.out.println(popupWindowHeadingText);
		Thread.sleep(3000);
		
		driver.switchTo().window(bloggerWindowId);
		
		WebElement signInOption = driver.findElement(By.xpath("//span[text()='Sign in']"));
		signInOption.click();
		Thread.sleep(10000);
		
		driver.quit();
		
	
	}

}
