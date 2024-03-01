package handlingmultiplewindows;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsNine {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.switchTo().window("abcdxyz123");
		

	}

}
