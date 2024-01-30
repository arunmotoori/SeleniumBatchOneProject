package seleniumcommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

	}

}
