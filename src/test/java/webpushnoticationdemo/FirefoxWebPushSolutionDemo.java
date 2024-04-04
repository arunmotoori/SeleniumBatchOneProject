package webpushnoticationdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxWebPushSolutionDemo {

	public static void main(String[] args) {
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications");
		options.addPreference("geo.enabled",false);

		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		
		
	}

}
