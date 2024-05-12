package javascriptexecutordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashingDemo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaFieldElement = driver.findElement(By.id("ta1"));
		flashElement(driver,textAreaFieldElement);
		textAreaFieldElement.sendKeys("Arun Motoori");
		
		WebElement searchField = driver.findElement(By.name("q"));
		flashElement(driver,searchField);
		searchField.sendKeys("Arun");
		
		WebElement maleRadio = driver.findElement(By.id("radio1"));
		flashElement(driver,maleRadio);
		maleRadio.click();
		
		WebElement blueCheckbox = driver.findElement(By.id("checkbox2"));
		flashElement(driver,blueCheckbox);
		blueCheckbox.click();
	}
	
	public static void flashElement(ChromeDriver driver,WebElement element) throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollIntoView()", element);
		for(int i=1;i<=3;i++) {
			jse.executeScript("arguments[0].style.backgroundColor='yellow'", element);
			jse.executeScript("arguments[0].style.border='2px solid red';", element);
			Thread.sleep(50);
			jse.executeScript("arguments[0].style.backgroundColor=''", element);
			jse.executeScript("arguments[0].style.border='';", element);
		}
		
	}

}
