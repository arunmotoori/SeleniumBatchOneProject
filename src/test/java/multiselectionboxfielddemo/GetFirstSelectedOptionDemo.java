package multiselectionboxfielddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdownField);
		
		select.selectByVisibleText("doc 3");
		select.selectByVisibleText("doc 1");
		
		WebElement selectedOption = select.getFirstSelectedOption();
		
		System.out.println(selectedOption.getText());
		
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		
		select = new Select(multiSelectionBoxField);
			
		select.selectByVisibleText("Audi");
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Swift");
		//select.selectByVisibleText("Volvo");
		
		WebElement multiFirstSelectedOption = select.getFirstSelectedOption();
		System.out.println(multiFirstSelectedOption.getText());
		
		
		driver.quit();

	}

}
