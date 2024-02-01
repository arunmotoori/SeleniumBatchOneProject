package seleniumcommandsthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement button2 = driver.findElement(By.id("but2"));
		boolean enableStatus = button2.isEnabled();
		
		if(enableStatus) {
			
			System.out.println("Button2 is in enabled state");
			
		}else {
			
			System.out.println("Button2 is in disabled state");
			
		}
		
		WebElement button1 = driver.findElement(By.id("but1"));
		boolean enableStatus2 = button1.isEnabled();
		
		if(enableStatus2) {
			
			System.out.println("Button1 is in enabled state");
			
		}else {
			
			System.out.println("Button1 is in disabled state");
			
		}
		
		driver.quit();
	}

}
