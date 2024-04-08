package multiselectionboxfielddemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		System.out.println("The below are the options from dropdown field:");
		
		WebElement fruitsField = driver.findElement(By.id("fruits"));
		
	    Select select = new Select(fruitsField);
	    
	    List<WebElement> fruits = select.getOptions();
	    
	    for(int i=1;i<fruits.size();i++) {
	    	System.out.println(fruits.get(i).getText());
	    }
	    
	    /*
	    for(WebElement fruit : fruits) {
	    	
	    	System.out.println(fruit.getText());
	    	
	    }*/
	    
	    System.out.println("The below are the options from multi-selection box field:");
	    
	    WebElement superHerosField = driver.findElement(By.id("superheros"));
	    
	    select = new Select(superHerosField);
	    
	    List<WebElement> heros = select.getOptions();
	    
	    for(WebElement hero : heros) {
	    	System.out.println(hero.getText());
	    }
	    
	    
	    driver.quit();

	}

}
