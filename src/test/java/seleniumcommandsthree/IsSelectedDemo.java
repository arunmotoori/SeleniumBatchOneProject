package seleniumcommandsthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement orangeCheckbox = driver.findElement(By.id("checkbox1"));
		boolean checkbox1Status = orangeCheckbox.isSelected();
		
		if(checkbox1Status) {
			
			System.out.println("Orange checkbox field is in selected state");
			
		}else {
			
			System.out.println("Orange checkbox field is not in selected state");
			
		}
		
		WebElement blueCheckbox = driver.findElement(By.id("checkbox2"));
		boolean chekcbox2Status = blueCheckbox.isSelected();
		
		if(chekcbox2Status) {
			
			System.out.println("Blue checkbox field is in selected state");
			
		}else {
			
			System.out.println("Blue checkbox field is not in selected state");
			
		}
		
		//Same thing you can do with radio buttons
		
		WebElement bikeradio = driver.findElement(By.xpath("//input[@value='Bike']"));

		if(bikeradio.isSelected()) {
			
			System.out.println("Bike radio field is in selected state");
			
		}else {
			
			System.out.println("Bike radio field is not in selected state");
			
		}
		
		WebElement bicycle = driver.findElement(By.xpath("//input[@value='Bicycle']"));
	
		if(bicycle.isSelected()) {
			
			System.out.println("Bicycle radio field is in selected state");
			
		}else {
			
			System.out.println("Bicycle radio field is not in selected state");
			
		}
		
		driver.quit();
	
	}

}
