package seleniumcommandstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtrribute {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement button = driver.findElement(By.xpath("//input[@title='search'][@type='submit']"));
		String buttonLable = button.getAttribute("value");
		
		System.out.println(buttonLable);
		
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		String nameValue = dropdownField.getAttribute("name");
		System.out.println(nameValue);
		
		driver.quit();
		
	}

}
