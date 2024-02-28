package handlingmultiplewindows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWindowsTwo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String omayoWindowId = driver.getWindowHandle();
		
		WebElement bloggerLink = driver.findElement(By.linkText("Blogger"));
		bloggerLink.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		String bloggerWindowId = null;
		
		for(String windowId : windowIds) {

			if(!windowId.equals(omayoWindowId)) {
				
				bloggerWindowId = windowId;
				
				driver.switchTo().window(windowId);
				
				break;
				
			}
		
		}
		
		WebElement signInOption = driver.findElement(By.xpath("//span[text()='Sign in']"));
		signInOption.click();
		
		driver.switchTo().window(omayoWindowId);
		
		WebElement teaxtAreaField = driver.findElement(By.id("ta1"));
		
		teaxtAreaField.sendKeys("Arun Motoori");
		
		driver.switchTo().window(bloggerWindowId);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']")));
		
		nextButton.click();
		
	}

}
