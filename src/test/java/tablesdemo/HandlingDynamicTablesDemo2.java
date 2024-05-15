package tablesdemo;

import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDynamicTablesDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedCustomer = "Rahul Das";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demo.opencart.com/admin/");
		
		WebElement usernameField = driver.findElement(By.id("input-username"));
		usernameField.sendKeys("demo");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("demo");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sales')]")));
		
		try {
			WebElement closeOption = driver.findElement(By.className("btn-close"));
			closeOption.click();
		}catch(Exception e){
			
		}
		
		WebElement salesOption = driver.findElement(By.xpath("//a[contains(text(),'Sales')]"));
		salesOption.click();
		
		WebElement ordersOption = driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
		ordersOption.click();
		
		WebElement pagesElement = driver.findElement(By.xpath("(//div[contains(@class,'text-end')])[2]"));
		String originalText = pagesElement.getText();
		System.out.println(originalText);
		String[] texts = originalText.split(Pattern.quote("("));
		String[] subtexts = texts[1].split(" ");
		String pagesNumberText = subtexts[0];
		int pageCount = Integer.parseInt(pagesNumberText);
		
		for(int p=1;p<=pageCount;p++) {
			
			String xpathText2 = "//form[@id='form-order']//table//td[text()='"+expectedCustomer+"']/preceding-sibling::td[3]";
			
			try {
				driver.findElement(By.xpath(xpathText2)).click();
				break;
			}catch(Exception e) {
				
			}
		
			String xpathText = "//li/*[@class='page-link'][text()='"+(p+1)+"']";
			driver.findElement(By.xpath(xpathText)).click();
			Thread.sleep(3000);
		
		}
	
	}

}
