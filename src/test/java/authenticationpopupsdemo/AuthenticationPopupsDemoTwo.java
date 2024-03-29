package authenticationpopupsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopupsDemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		
		WebElement basicAuthLink = driver.findElement(By.linkText("Basic Auth"));
		basicAuthLink.click();
		
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	}

}
