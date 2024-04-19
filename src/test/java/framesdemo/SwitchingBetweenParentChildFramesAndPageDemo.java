package framesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenParentChildFramesAndPageDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		WebElement pageHeading = driver.findElement(By.xpath("//div[@class='hero-body']//h1"));
		String pageHeadingText = pageHeading.getText().trim();
		System.out.println(pageHeadingText);
		
		driver.switchTo().frame("firstFr");
		
		WebElement firstNameField = driver.findElement(By.name("fname"));
		firstNameField.sendKeys("Arun");
		
		WebElement lastNameField = driver.findElement(By.name("lname"));
		lastNameField.sendKeys("Motoori");
		
		WebElement innerFrameElement = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(innerFrameElement);
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("arun@gmail.com");
		
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		firstNameField.clear();
		lastNameField.clear();
		
		driver.switchTo().defaultContent();
		
		pageHeadingText = pageHeading.getText().trim();
		
		System.out.println(pageHeadingText);
		
		driver.quit();
	
	}

}
