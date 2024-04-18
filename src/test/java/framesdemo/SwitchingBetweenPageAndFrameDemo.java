package framesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenPageAndFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		driver.switchTo().frame("iframe1");
		
		WebElement whatIsSelenium = driver.findElement(By.linkText("What is Selenium?"));
		String url = whatIsSelenium.getAttribute("href");
		System.out.println(url);
		
		driver.switchTo().defaultContent();
		
		WebElement textBoxField = driver.findElement(By.name("q"));	
		textBoxField.sendKeys("QAFox");
		

	}

}
