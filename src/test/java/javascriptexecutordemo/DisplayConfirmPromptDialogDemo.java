package javascriptexecutordemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayConfirmPromptDialogDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qafox.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("alert('Hi Everyone')");
		//jse.executeScript("confirm('Do you agree with me?')");
		jse.executeScript("prompt('Enter your name?')");

	}

}
