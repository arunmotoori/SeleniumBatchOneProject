package webpushnoticationdemo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfileDemo {

	public static void main(String[] args) {
		
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile defaultReleaseProfile = profiles.getProfile("default-release");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(defaultReleaseProfile);
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

	}

}
