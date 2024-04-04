package bootstrapmodeldialogdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapModelDailogSample {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_modal.asp");
		
		WebElement modalButton = driver.findElement(By.xpath("//button[text()='Click To Open Modal']"));
		modalButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement modalPara = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myModal']//p")));
	
		String paraText = modalPara.getText();
		System.out.println(paraText);
		
		WebElement modalHeading = driver.findElement(By.id("myModalLabel"));
		String headingText = modalHeading.getText();
		System.out.println(headingText);
		
		Thread.sleep(4000);
		
		/*
		WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
		closeButton.click();*/
	
		WebElement xButton = driver.findElement(By.xpath("//button[@aria-label='Close']/span[text()='×']"));
		xButton.click();
		
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
