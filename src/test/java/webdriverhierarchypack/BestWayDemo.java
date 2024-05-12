package webdriverhierarchypack;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestWayDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any browser say chrome/firefox/edge");
		String browserName = scanner.nextLine();
		scanner.close();
		
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
