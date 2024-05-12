package javascriptexecutordemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/*
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		*/
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String pageTitle = (String)jse.executeScript("return document.title;");
		System.out.println(pageTitle);
		
		driver.quit();

	}

}
