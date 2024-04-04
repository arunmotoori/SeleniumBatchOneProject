package handlingcookies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCookiesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.whitehouseblackmarket.com/store");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
		
		WebElement textOnCookiesDialog = driver.findElement(By.id("onetrust-policy-text"));
		String cookiesDialogDiplayText = textOnCookiesDialog.getText();
		System.out.println(cookiesDialogDiplayText);
		
		WebElement manageCookiesButton = driver.findElement(By.id("onetrust-pc-btn-handler"));
		manageCookiesButton.click();
		
		WebElement confirmMyChoicesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Confirm My Choices']")));
		
		WebElement performanceToggleOption = driver.findElement(By.xpath("//span[text()='Performance Cookies']/preceding-sibling::span"));
		performanceToggleOption.click();
		
		Thread.sleep(3000);
		
		confirmMyChoicesButton.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
