package webpushnoticationdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsHeadlessDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);

	}

}
