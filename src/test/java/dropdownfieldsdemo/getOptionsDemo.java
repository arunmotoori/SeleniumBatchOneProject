package dropdownfieldsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropDownField = driver.findElement(By.id("drop1"));

		Select select = new Select(dropDownField);
		
		List<WebElement> options = select.getOptions();
		
		int s = options.size();
		
		System.out.println("Number of options in this drodownField are:"+s);
		
		System.out.println("The below are the list of options in the dropdown field:");
		
		for(WebElement e : options) {
			
			System.out.println(e.getText());
			
		}
		
		driver.quit();
		

	}

}
