package waitingmechanismdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BothImplictExplicitDemo {

	public static void main(String[] args) {
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2950));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
		
		driver.findElement(By.linkText("Flipkart")).click();
	
	}

}
