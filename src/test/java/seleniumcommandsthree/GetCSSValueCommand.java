package seleniumcommandsthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValueCommand {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement cartButton = driver.findElement(By.id("cart"));
		
		String cartButtonColor = cartButton.getCssValue("color");
		String cartButtonFontWeight = cartButton.getCssValue("font-weight");
		
		System.out.println(cartButtonColor);
		System.out.println(cartButtonFontWeight);
		
		driver.quit();

	}

}
