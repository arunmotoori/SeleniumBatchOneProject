package waitingmechanismdemo;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

	}

}
