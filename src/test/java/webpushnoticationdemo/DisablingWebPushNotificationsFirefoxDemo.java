package webpushnoticationdemo;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;

public class DisablingWebPushNotificationsFirefoxDemo {

	public static void main(String[] args) {
		
		/*
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profileX = allProfiles.getProfile("ProfileX");
		profileX.setPreference("dom.webnotifications.enabled",false);
		profileX.setPreference("dom.push.enabled", false);
		profileX.setPreference("dom.disable_beforeunload", true);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profileX);
		options.addPreference("dom.webnotifications.enabled",false);
		options.addPreference("dom.push.enabled", false);
		options.addPreference("dom.disable_beforeunload", true);
		options.addArguments("--disabled-notifications");
		
		//WebDriverManager.firefoxdriver().setup();
		 * 
		 * 
		 */
		/*
		 ProfilesIni profile = new ProfilesIni();

		  FirefoxProfile testprofile = profile.getProfile("default");

		  testprofile.setPreference("dom.webnotifications.enabled", false);

		  testprofile.setPreference("dom.push.enabled", false);
		  
		  testprofile.setPreference("geo.enabled", true);

		  FirefoxOptions options = new FirefoxOptions();
		  options.setProfile(testprofile);
		  */
		
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("geo.enabled",false);
		
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");

	}

}
