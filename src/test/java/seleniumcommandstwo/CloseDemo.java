package seleniumcommandstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement link1Element = driver.findElement(By.id("selenium143"));
		link1Element.click();
		
		WebElement link2Element = driver.findElement(By.linkText("Open a popup window"));
		link2Element.click();
		
		driver.close();

	}

}
