package dropdownfieldsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement dropdownFieldElement = driver.findElement(By.id("cars"));
		
		Select select = new Select(dropdownFieldElement);
		
		select.selectByIndex(2);

	}

}
