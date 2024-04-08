package multiselectionboxfielddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropDownField = driver.findElement(By.id("drop1"));
		WebElement multiSelectField = driver.findElement(By.id("multiselect1"));
		
		Select select1 = new Select(dropDownField);
		Select select2 = new Select(multiSelectField);
		
		if(select1.isMultiple()) {
			System.out.println("It is a multi-selection box field");
		}else {
			System.out.println("It is a dropdown field");
		}
		
		if(select2.isMultiple()) {
			System.out.println("It is a multi-selection box field");
		}else {
			System.out.println("It is a dropdown field");
		}

	}

}
