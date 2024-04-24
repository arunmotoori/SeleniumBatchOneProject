package actionsmousekeyboardeventsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		
		Actions actions = new Actions(driver);
		
		WebElement minPrice = driver.findElement(By.xpath("//a[@*='price-min-label']"));
		
//		actions.dragAndDropBy(minPrice,100, 0).perform();
		
		actions.dragAndDropBy(minPrice,-100, 0).perform();
		
		
	}

}
