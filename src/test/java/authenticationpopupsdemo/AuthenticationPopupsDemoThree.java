package authenticationpopupsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupsDemoThree {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		WebElement checkboxLink = driver.findElement(By.linkText("Checkboxes"));
		checkboxLink.click();
		
		WebElement checkboxOne = driver.findElement(By.xpath("(//form[@id='checkboxes']/input)[1]"));
		checkboxOne.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		WebElement basicAuthLink = driver.findElement(By.linkText("Basic Auth"));
		basicAuthLink.click();
		
	}

}
