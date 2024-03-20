package doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubtTwo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement preLoadedTextField = driver.findElement(By.id("textbox1"));
		
		String preloadedText = preLoadedTextField.getAttribute("value");
		System.out.println(preloadedText);
		
		preLoadedTextField.clear();
		
		preLoadedTextField.sendKeys("Arun Motoori");
		
		preLoadedTextField.clear();
		
		preLoadedTextField.sendKeys("Selenium Java Training");
		
		preLoadedTextField.clear();
		
		preLoadedTextField.sendKeys("QAFox");

	}

}
