package seleniumcommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}

}
