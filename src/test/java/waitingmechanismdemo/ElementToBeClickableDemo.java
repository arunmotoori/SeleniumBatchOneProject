package waitingmechanismdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementToBeClickableDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://verifalia.com/validate-email");
		
		WebElement emailField = driver.findElement(By.name("inputData"));
		emailField.sendKeys("a@b.com");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement validateButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Validate']")));
		validateButton.click();
		
	

	}

}
