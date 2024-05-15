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

public class HandlingDynamicTablesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedCustomer = "Rahul Das";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
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
			System.out.println(e);
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
		
		List<WebElement> customers = null;
		
		extloop: for(int p=1;p<=pageCount;p++) {
		
			 customers = driver.findElements(By.xpath("//form[@id='form-order']//table/tbody/tr//td[4]"));
			
			 for(int i=0;i<customers.size();i++) {
				
				String acutalCustomerName = customers.get(i).getText();
				
				if(acutalCustomerName.equals(expectedCustomer)) {
					
					WebElement checkBox = driver.findElement(By.xpath("//form[@id='form-order']//table/tbody/tr["+(i+1)+"]//td[1]"));
					checkBox.click();
					break extloop;
				}
				
			}
			 
			String xpathText = "//li/*[@class='page-link'][text()='"+(p+1)+"']";
			driver.findElement(By.xpath(xpathText)).click();
			Thread.sleep(3000);
		
		}
	
	}

}
