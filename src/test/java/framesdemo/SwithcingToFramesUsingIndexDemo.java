package framesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithcingToFramesUsingIndexDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame(0);
		
		WebElement paraText = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		paraText.clear();
		paraText.sendKeys("Arun Motoori @ QAFox");

	}

}
