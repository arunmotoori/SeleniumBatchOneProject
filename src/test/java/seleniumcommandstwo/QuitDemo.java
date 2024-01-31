package seleniumcommandstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("selenium143")).click();
		driver.findElement(By.linkText("Open a popup window")).click();
		
		driver.quit();

	}

}
