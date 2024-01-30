package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textField = driver.findElement(By.id("textbox1"));
		textField.clear();
		textField.sendKeys("Arun Motoori");
		textField.clear();
		textField.sendKeys("QAFox");
		textField.clear();
		textField.sendKeys("Selenium Java");
		

	}

}
