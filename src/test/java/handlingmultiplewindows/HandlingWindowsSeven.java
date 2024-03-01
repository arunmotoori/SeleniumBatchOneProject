package handlingmultiplewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsSeven {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
		WebElement selenium143Link = driver.findElement(By.id("selenium143"));
		selenium143Link.click();
		
		WebElement newPopupWindowLink = driver.findElement(By.linkText("Open a popup window"));
		newPopupWindowLink.click();
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
