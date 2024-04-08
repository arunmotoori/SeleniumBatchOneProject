package alertsdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleAlertOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.mobiscroll.com/javascript/forms/alert-confirm-prompt");
		
		WebElement alertButton = driver.findElement(By.id("show-alert"));
		alertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement okButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='OK']")));

		WebElement textOnDialog = driver.findElement(By.xpath("//div[@class='mbsc-alert-content']//h2"));
		String textOnDialogBox = textOnDialog.getText();
		System.out.println(textOnDialogBox);
		
		okButton.click();
	}

}
