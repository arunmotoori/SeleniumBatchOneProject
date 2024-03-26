package doubts;

import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitDoubt {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/*
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);
		 		
			   WebElement checkBox = wait.until(new Function<WebDriver, WebElement>()
			   {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//a[@href='http://flipkart.com/']"));   
			     }
			   });
*/
	}

}
