package gettingstarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement searchBoxField = driver.findElement(By.name("search"));
		searchBoxField.sendKeys("HP");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		searchButton.click();
		
		WebElement hpProduct = driver.findElement(By.linkText("HP LP3065"));
		
		boolean displayStatus = hpProduct.isDisplayed();
		
		if(displayStatus) {
			
			System.out.println("HP Product is displayed in search results. Hence Test Passed.");
			
		}else {
			
			System.out.println("HP Product is not displayed in search results. Hence Test Failed.");
			
		}
		
		driver.close();

	}

}
