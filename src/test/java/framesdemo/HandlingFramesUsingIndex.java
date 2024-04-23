package framesdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesUsingIndex {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		By descriptionBy = By.linkText("Description");
		
		int frameIndex = findIndexOfFrame(driver,descriptionBy);
		
		driver.switchTo().frame(frameIndex);
		
		WebElement descriptionLink = driver.findElement(descriptionBy);
		descriptionLink.click();
		
		/*
		int framesCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(framesCount);
		int index = 0;
		
		for(int i=0;i<framesCount;i++) {
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
			
			int s = driver.findElements(By.linkText("Description")).size();
			
			if(s>0) {
				index = i;
				break;
			}
			
		}
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(index);
		
		WebElement descriptionLink = driver.findElement(By.linkText("Description"));
		descriptionLink.click();
		
		*/
		
		/*
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println(frames.size());
		
		driver.switchTo().frame(2);
		
		WebElement descriptionLink = driver.findElement(By.linkText("Description"));
		descriptionLink.click();
		*/
		
	}
	
	public static int findIndexOfFrame(ChromeDriver driver,By locator) {
		
		int index = 0;
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		int framesCount = frames.size();
		
		for(int i=0;i<framesCount;i++) {
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
			
			int s = driver.findElements(locator).size();
			
			if(s>0) {
				index = i;
				break;
			}
			
		}
		
		driver.switchTo().defaultContent();
		return index;
	}

}
