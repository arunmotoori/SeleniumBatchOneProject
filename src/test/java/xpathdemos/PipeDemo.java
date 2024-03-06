package xpathdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PipeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> eles = driver.findElements(By.xpath("//textarea[@id='ta1'] | //input[@name='q'][@title='search']"));
		
		for(WebElement e : eles) {
			
			String tagName = e.getTagName();
			
			if(tagName.equals("textarea")) {
				
				e.sendKeys("Arun");
				
			}else {
				
				e.sendKeys("Motoori");
				
			}
			
		}
		
		/*
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		
		List<WebElement> heles = driver.findElements(By.xpath("//input[@name='fldLoginUserId'] | //a[text()='CONTINUE']"));
		
		for(WebElement he : heles) {
			
			String tn = he.getTagName();
			
			if(tn.equals("input")) {
				
				he.sendKeys("12345");
				Thread.sleep(3000);
				
			}else {
				
				he.click();
				
			}
			
		}
		*/
	
	
	}

}
