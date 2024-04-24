package actionsmousekeyboardeventsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsDemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
		
		actions.moveToElement(blogsMenu).perform();
		
		WebElement seleniumByArunOption = driver.findElement(By.xpath("//a/span[text()='SeleniumByArun']"));
		
		actions.moveToElement(seleniumByArunOption).click().build().perform();
		
		

	}

}
