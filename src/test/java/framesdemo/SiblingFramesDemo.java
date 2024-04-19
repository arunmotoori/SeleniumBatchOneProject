package framesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingFramesDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		String leftText = driver.switchTo().frame("frame-top").switchTo().frame("frame-left").findElement(By.tagName("body")).getText().trim();
		System.out.println(leftText);
		
		String middleText = driver.switchTo().parentFrame().switchTo().frame("frame-middle").findElement(By.id("content")).getText();
		System.out.println(middleText);
		
		String rightText = driver.switchTo().parentFrame().switchTo().frame("frame-right").findElement(By.tagName("body")).getText().trim();
		System.out.println(rightText);
		
		String bottomText = driver.switchTo().defaultContent().switchTo().frame("frame-bottom").findElement(By.tagName("body")).getText().trim();
		System.out.println(bottomText);
		
		driver.quit();
		
		/*
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		WebElement leftFrameBody = driver.findElement(By.tagName("body"));
		String leftText = leftFrameBody.getText().trim();
		*/
        
		/*
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		
		WebElement middleTextElement = driver.findElement(By.id("content"));
		String middleText = middleTextElement.getText();
		System.out.println(middleText);
		*/
		
		/*
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		
		WebElement rigthTextBodyElement = driver.findElement(By.tagName("body"));
		String rightText = rigthTextBodyElement.getText().trim();
		System.out.println(rightText);
		*/
		
		
		/*
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		
		WebElement bottomBodyElement = driver.findElement(By.tagName("body"));
		String bottomText = bottomBodyElement.getText().trim();
		System.out.println(bottomText);
		*/
		
		//driver.quit();
		
	
	}

}
