package javascriptexecutordemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDateDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		WebElement calendarTextField = driver.findElement(By.id("datepicker"));
//		calendarTextField.sendKeys("06/17/2026");
//		calendarTextField.sendKeys(Keys.ENTER);
//		WebElement headingElement = driver.findElement(By.xpath("//h1[contains(text(),'Calendar Handle')]"));
//		headingElement.click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='06/17/2026'",calendarTextField);
		
	}

}
