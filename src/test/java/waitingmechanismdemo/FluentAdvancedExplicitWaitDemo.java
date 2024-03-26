package waitingmechanismdemo;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentAdvancedExplicitWaitDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownButton = driver.findElement(By.className("dropbtn"));
		dropdownButton.click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
		
		       

			   WebElement flipkartOption = wait.until(new Function<WebDriver,WebElement>(){
				   	public WebElement apply(WebDriver driver) {
				   		return driver.findElement(By.linkText("Filpkart"));
				   	}
			   });
			   
			  /*
			   WebElement element = wait.until(driver1 -> {
		            return driver1.findElement(By.id("myElement"));
		        });
		        */
			   
			   flipkartOption.click();
	
	
	}
			  

		
}

