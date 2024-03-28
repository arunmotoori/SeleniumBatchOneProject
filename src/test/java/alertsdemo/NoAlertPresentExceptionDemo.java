package alertsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresentExceptionDemo {

	public static void main(String[] args)  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement infoAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		//infoAlertButton.click();
		//driver.switchTo().alert();
		//String textOnAlert = alert.getText();
		//System.out.println(textOnAlert);
		
		Alert alert = null;
		
		try {
			
			alert = driver.switchTo().alert();
			String textOnAlert = alert.getText();
			System.out.println(textOnAlert);
			
		}catch(NoAlertPresentException e) {
			
			System.out.println("No Alert has come.");
		
		}
		
		

	}

}
