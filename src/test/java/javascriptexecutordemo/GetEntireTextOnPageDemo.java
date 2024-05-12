package javascriptexecutordemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetEntireTextOnPageDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qafox.com/170-plus-software-testing-types/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String textOnPage = jse.executeScript("return document.documentElement.innerText").toString();
		System.out.println(textOnPage);
		
		driver.quit();
	}

}
