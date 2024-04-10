package bootstrapdropdowndemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAllOptionsInBootstrapDropdownField {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		WebElement selectProductType = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
		selectProductType.click();
		
		List<WebElement> options = driver.findElements(By.xpath("//a[text()='Select Product Type']/following-sibling::ul/li[not(@value='0')]"));
	
	    for(WebElement option : options) {
	    	System.out.println(option.getText());
	    }
	    
	    driver.quit();
	
	}

}
