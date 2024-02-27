package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String omayoWindowId = driver.getWindowHandle();
		
		WebElement bloggerLink = driver.findElement(By.linkText("Blogger"));
		bloggerLink.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		for(String windowId : windowIds) {
			
			driver.switchTo().window(windowId);
			
			String exepectedTitle = "Blogger.com - Create a unique and beautiful blog easily.";
			
			String actualTitle = driver.getTitle();
			
			if(actualTitle.equals(exepectedTitle)) {
				
				break;
				
			}
			
		}
		
		WebElement signInOption = driver.findElement(By.xpath("//span[text()='Sign in']"));
		signInOption.click();
		
		driver.close();
	
		driver.switchTo().window(omayoWindowId);
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		driver.close();
	

	}

}
