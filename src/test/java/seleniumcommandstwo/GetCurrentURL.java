package seleniumcommandstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String urlOne = driver.getCurrentUrl();
		System.out.println(urlOne);
		
		WebElement linkElement = driver.findElement(By.linkText("compendiumdev"));
		linkElement.click();
		
		String urlTwo = driver.getCurrentUrl();
		System.out.println(urlTwo);
		
		driver.close();

	}

}
