package dropdownfieldsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdownField);
		
		if(select.isMultiple()) {
			System.out.println("It is not a dropdown field, as you can select multiple options here");
		}else {
			System.out.println("It is a dropdown field where you can select only one option");
		}
		
		driver.quit();
		
		/*
		boolean b = select.isMultiple();
		
		System.out.println(b);*/

	}

}
