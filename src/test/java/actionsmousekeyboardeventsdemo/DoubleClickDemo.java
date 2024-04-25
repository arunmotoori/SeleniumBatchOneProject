package actionsmousekeyboardeventsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement doubleClickOption = driver.findElement(By.id("testdoubleclick"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(doubleClickOption).perform();
		
		
		
	}

}
