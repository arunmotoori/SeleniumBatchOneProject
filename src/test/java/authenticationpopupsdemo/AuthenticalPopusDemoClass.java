package authenticationpopupsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticalPopusDemoClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
		WebElement result = driver.findElement(By.xpath("//div[@id='content']//p"));
		String resultText = result.getText();
		System.out.println(resultText);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
