package xpathdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathMultipleFindElement {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement ele = driver.findElement(By.xpath("//textarea[@id='ta1'] | //input[@name='q'][@title='search']"));
		
		ele.sendKeys("Arun Motoori");
		
		
	}

}
