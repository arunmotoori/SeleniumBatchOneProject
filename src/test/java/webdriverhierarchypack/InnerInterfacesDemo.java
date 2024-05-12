package webdriverhierarchypack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerInterfacesDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
		Timeouts timeouts = options.timeouts();
		timeouts.implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		Navigation navigation = driver.navigate();
		navigation.to("https://www.qafox.com/");
		navigation.refresh();
		navigation.forward();
		navigation.back();
		
		TargetLocator targetLocator = driver.switchTo();
		targetLocator.alert();
		
		

	}

}
