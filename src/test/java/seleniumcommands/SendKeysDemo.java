package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Arun Motoori");
		Thread.sleep(2000);
		driver.findElement(By.name("pswrd")).sendKeys("12345");
		
	}

}
