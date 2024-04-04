package lightboxdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripLightBoxDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@id='webengage-notification-container']/iframe")));
			WebElement closeOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("close")));
			closeOption.click();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			driver.switchTo().defaultContent();
			
		}
		
		
		
		
	}

}
