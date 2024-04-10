package bootstrapdropdowndemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HDFCBootstrapDropdownDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		WebElement selectProductType = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
		selectProductType.click();
	
		WebElement payzappOption = driver.findElement(By.xpath("//li[text()='Cards']"));
		
		payzappOption.click();
		
		WebElement selectProduct = driver.findElement(By.xpath("//a[text()='Select Product']"));
		selectProduct.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement debitCardOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Debit Cards']")));
		debitCardOption.click();
		

	}

}
