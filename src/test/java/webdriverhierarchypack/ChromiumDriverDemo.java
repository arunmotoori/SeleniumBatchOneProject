package webdriverhierarchypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromiumDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\chrome-win\\chrome.exe");
		//ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
