package javascriptexecutordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTextIntoDisabledFieldDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement disabledTextField = driver.findElement(By.id("tb2"));
//		disabledTextField.sendKeys("Arun Motoori");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='Arun Motoori'", disabledTextField);
	}

}
