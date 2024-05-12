package javascriptexecutordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {

	public static void main(String[] args) throws InterruptedException {
		
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://omayo.blogspot.com/");
//		
//		WebElement userIdField = driver.findElement(By.name("userid"));
//		userIdField.sendKeys("ArunMotoori");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		WebElement buttonElement = driver.findElement(By.id("isDisabled"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollIntoView()",buttonElement);
		//jse.executeScript("window.scrollTo(0,200)");	
		jse.executeScript("window.scrollTo(0,document.documentElement.scrollHeight)");
		buttonElement.click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,-100)");
		
	
	}

}
