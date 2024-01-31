package seleniumcommandstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement button = driver.findElement(By.id("alert1"));
		boolean visibleStatus = button.isDisplayed();
		System.out.println(visibleStatus);
		
		if(visibleStatus) {
			
			System.out.println("Visible on page");
			
		}else {
			
			System.out.println("Not visible on page");
			
		}
		
		WebElement button2 = driver.findElement(By.id("hbutton"));
		boolean visibleStatus2 = button2.isDisplayed();
		System.out.println(visibleStatus2);
		
		if(visibleStatus2) {
			
			System.out.println("Button2 is Visible on page");
			
		}else {
			
			System.out.println("Button2 is not visible on page");
			
		}
		
		driver.quit();

	}

}
