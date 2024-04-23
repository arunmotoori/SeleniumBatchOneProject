package framesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingInnerTextDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\arunm\\Downloads\\Box\\SampleHTMLFile.html");
		
		String text = driver.findElement(By.id("one")).getText();
		
		System.out.println(text);
		
		driver.quit();

	}

}
