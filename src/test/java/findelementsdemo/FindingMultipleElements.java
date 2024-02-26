package findelementsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingMultipleElements {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		
		for(WebElement option : options) {
			
			String optionText = option.getText();
			System.out.println(optionText);
			
		}
		
		driver.quit();
		

	}

}
