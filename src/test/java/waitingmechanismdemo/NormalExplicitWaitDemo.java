package waitingmechanismdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NormalExplicitWaitDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropDownButton = driver.findElement(By.className("dropbtn"));
		dropDownButton.click();
		
		//long startTime = System.currentTimeMillis();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement flipkartOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));

		//long endTime = System.currentTimeMillis();
		
		//System.out.println((endTime-startTime)/1000);
		
		flipkartOption.click();
		
	}

}
