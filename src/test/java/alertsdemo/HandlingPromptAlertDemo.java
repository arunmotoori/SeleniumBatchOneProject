package alertsdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingPromptAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement promptAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		promptAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
		
		alert.sendKeys("Arun Motoori");
		
		Thread.sleep(3000);
		
		//alert.accept();
		alert.dismiss();
		
		driver.switchTo().defaultContent();
		
		WebElement result = driver.findElement(By.id("result"));
		String resultText = result.getText();
		System.out.println(resultText);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
