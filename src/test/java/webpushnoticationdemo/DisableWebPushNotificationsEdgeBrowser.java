package webpushnoticationdemo;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DisableWebPushNotificationsEdgeBrowser {

	public static void main(String[] args) {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		
		EdgeDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		
		

	}

}
