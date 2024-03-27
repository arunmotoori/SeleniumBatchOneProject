package alertsdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DismissingInformationAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement infoAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		infoAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
		
		Thread.sleep(5000);
		
		alert.dismiss();
		
		driver.switchTo().defaultContent();
		
		WebElement result = driver.findElement(By.id("result"));
		
		String resultText = result.getText();
		
		System.out.println(resultText);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
