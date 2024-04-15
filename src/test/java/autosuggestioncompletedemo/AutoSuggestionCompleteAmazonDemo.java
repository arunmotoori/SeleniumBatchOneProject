package autosuggestioncompletedemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionCompleteAmazonDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement searchBoxField = driver.findElement(By.id("twotabsearchtextbox"));
		searchBoxField.sendKeys("l");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='s-heavy']")));
		
		String productName = "lunch box";
		
		List<WebElement> options = driver.findElements(By.xpath("//span[@class='s-heavy']/parent::div"));
		
		for(WebElement option : options) {
			
			if(option.getAttribute("aria-label").equals(productName)) {
				option.click();
				break;
			}
			
		}
		
		
		/*
		for(WebElement option: options) {
			
			searchBoxField.sendKeys(Keys.ARROW_DOWN);
			
			if(option.getAttribute("aria-label").equals(productName)) {
				searchBoxField.sendKeys(Keys.ENTER);
				break;
			}
			
		}*/
		
		
		/*
		Actions actions = new Actions(driver);
		actions.pause(2000)
		.moveToElement(searchBoxField)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build().perform();
		*/
		
		/*
		for(int i=1;i<=5;i++)
			searchBoxField.sendKeys(Keys.ARROW_DOWN);
		searchBoxField.sendKeys(Keys.ENTER);
		*/
		
		
		WebElement resultsElement = driver.findElement(By.xpath("(//span[contains(text(),'results')])[1]/following-sibling::span[2]"));
		String resultsText = resultsElement.getText();
		System.out.println(resultsText);
	
		
		driver.quit();
	}

}
