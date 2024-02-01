package seleniumcommandsthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(3000);
		
		WebElement selenium143Link = driver.findElement(By.id("link1"));
		selenium143Link.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://selenium-by-arun.blogspot.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
