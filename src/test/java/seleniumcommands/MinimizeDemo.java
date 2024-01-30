package seleniumcommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().minimize();

	}

}
