package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("textbox1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Text Area Field Two']/following::textarea")).clear();

	}

}
