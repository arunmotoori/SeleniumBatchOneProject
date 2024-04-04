package doubts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookCart {

	@Test
	public void bookCartPricesTestOne() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bookcart.azurewebsites.net/");
		
		
		List<WebElement> categories = driver.findElements(By.xpath("//mat-list-item[contains(@class,'ng-star-inserted')]"));
		int size = categories.size();
		String xpathText = null;
		
		
		for(int i=1;i<=size;i++) {
			
			xpathText ="(//mat-list-item[contains(@class,'ng-star-inserted')])["+i+"]";
			WebElement category = driver.findElement(By.xpath(xpathText));
			category.click();
			WebElement firstBook = driver.findElement(By.xpath("(//app-book-card)[1]"));
			firstBook.click();
			WebElement addToCartButton = driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[1]"));
			addToCartButton.click();
			driver.navigate().back();
			//Thread.sleep(3000);
		
		}
		
		driver.navigate().refresh();
		
		WebElement cartButton = driver.findElement(By.xpath("//button[@ng-reflect-router-link='/shopping-cart']"));
		cartButton.click();
		
		List<WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[5]"));
		
		double n = 0;
		
		for(WebElement p : prices) {
			
			String priceText = p.getText();
			String priceTextWithoutRupee = priceText.replace("₹","").replace(",","");
			n = n + Double.parseDouble(priceTextWithoutRupee);
			
		}
		
		double beforeModifyingPrices = n;
		
		WebElement cartTotalPriceElement = driver.findElement(By.xpath("//td/*[text()='Cart Total:']/following::strong"));
		String cartTotalText = cartTotalPriceElement.getText().replace("₹","").replace(",","");
		double beforeModifyingCartTotalPrice = Double.parseDouble(cartTotalText);
		
		Assert.assertEquals(beforeModifyingPrices, beforeModifyingCartTotalPrice);
		
		List<WebElement> plusIcons = driver.findElements(By.xpath("//mat-icon[text()='add_circle']/following-sibling::span[@class='mat-mdc-button-touch-target']"));
		int plusIconsNumber = plusIcons.size();
		for(int i=1;i<=plusIconsNumber;i++) {
			String xpathText2 = "(//mat-icon[text()='add_circle']/following-sibling::span[@class='mat-mdc-button-touch-target'])["+i+"]";
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),' One item added to cart')]")));
			WebElement plusElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathText2)));
			plusElement.click();
		}
		
		List<WebElement> modifiedPrices = driver.findElements(By.xpath("//tbody/tr/td[5]"));
		
		double m = 0;
		
		for(WebElement p : modifiedPrices) {
			
			String priceText = p.getText();
			String priceTextWithoutRupee = priceText.replace("₹","").replace(",","");
			m = m + Double.parseDouble(priceTextWithoutRupee);
			
		}
		
		double afterModifyingPrice = m;
		
		WebElement cartTotalPriceElement2 = driver.findElement(By.xpath("//td/*[text()='Cart Total:']/following::strong"));
		String cartTotalText2 = cartTotalPriceElement2.getText().replace("₹","").replace(",","");
		double afterModifyingCartTotalPrice = Double.parseDouble(cartTotalText2);
		
		Assert.assertEquals(afterModifyingPrice, afterModifyingCartTotalPrice);
		
		
		driver.quit();
	}

}
