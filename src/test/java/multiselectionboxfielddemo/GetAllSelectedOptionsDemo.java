package multiselectionboxfielddemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdownField);
		
		select.selectByVisibleText("doc 3");
		
		List<WebElement> options = select.getAllSelectedOptions();
		
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
	
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		
		select = new Select(multiSelectionBoxField);
		
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(3);
		
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
		for(WebElement selectedOption : selectedOptions) {
			System.out.println(selectedOption.getText());
		}
		
		
		driver.quit();

	}

}
