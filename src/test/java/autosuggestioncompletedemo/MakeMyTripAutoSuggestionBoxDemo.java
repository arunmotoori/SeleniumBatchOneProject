package autosuggestioncompletedemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripAutoSuggestionBoxDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		String requiredFromPlace = "Naples, Italy";
		
		driver.findElement(By.id("fromCity")).click();
		
		WebElement fromField = driver.findElement(By.xpath("//input[@placeholder='From']"));
		//fromField.click();
		fromField.sendKeys("N");
		
		List<WebElement> places = driver.findElements(By.xpath("//label[@for='fromCity']/following-sibling::div[1]//p[contains(@class,'blackText')]"));
		
		for(WebElement place : places) {
			
			if(place.getText().equals(requiredFromPlace)) {
				place.click();
				break;
			}
			
		}
		
	}

}
