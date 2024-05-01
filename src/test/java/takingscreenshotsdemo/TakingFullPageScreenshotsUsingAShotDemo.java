package takingscreenshotsdemo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakingFullPageScreenshotsUsingAShotDemo {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		String destPath = System.getProperty("user.dir")+"\\screenshots\\chromeFullPage2.png";
		ImageIO.write(screenshot.getImage(),"PNG",new File(destPath));
	
		driver.quit();
		
	}

}
