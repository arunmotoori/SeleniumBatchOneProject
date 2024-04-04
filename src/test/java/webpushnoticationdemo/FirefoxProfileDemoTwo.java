package webpushnoticationdemo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfileDemoTwo {

	public static void main(String[] args) {
		
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile defaultProfile = profiles.getProfile("default-release");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(defaultProfile);
		
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
	}

}
