package handlingmultiplewindows;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsEight {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://selenium143.blogspot.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://selenium-by-arun.blogspot.com/");
		
	
	}

}
