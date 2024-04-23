package framesdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherWayToCheckElementDisplayedOnPageDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		if(driver.findElements(By.id("drop1abc")).size()>0) {
			System.out.println("Element is displayed on the page");
		}else {
			System.out.println("Element is not displayed on the page");
		}
		
		driver.quit();
		
		
		/*
		List<WebElement> elements = driver.findElements(By.id("drop1abc"));
		System.out.println(elements.size());
		*/
		
		/*
		try {
			if(driver.findElement(By.id("drop1abc")).isDisplayed()) {
				System.out.println("Element is present on the page");
			}
		}catch(NoSuchElementException e) {
			System.out.println("Element is not present on the page.");
		}*/

		//System.out.println("End of this program");
	}

}
