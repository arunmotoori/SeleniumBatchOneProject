package takingscreenshotsdemo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.Duration;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotClassScreenshotsDemo {

	public static void main(String[] args) throws AWTException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		
		takeScreenshotUsingRobot(1);
		
		WebElement jsAlertLink = driver.findElement(By.linkText("JavaScript Alerts"));
		jsAlertLink.click();
		
		
		WebElement jsAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		jsAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		takeScreenshotUsingRobot(2);
	
		
		driver.quit();
		
	}
	
	public static void takeScreenshotUsingRobot(int i) {
		
		Robot robot = null;
		
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(dim);
		BufferedImage bImage = robot.createScreenCapture(rect);
		
		String destPath = System.getProperty("user.dir")+"\\screenshots\\ImageX"+i+".png";
		try {
			ImageIO.write(bImage,"png",new File(destPath));
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}

}
