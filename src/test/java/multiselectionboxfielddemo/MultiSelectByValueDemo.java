package multiselectionboxfielddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectByValueDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement multiSelectionBoxField = driver.findElement(By.id("superheros"));
		
		Select select = new Select(multiSelectionBoxField);
		
		select.selectByValue("am");
		select.selectByValue("ta");
		select.selectByValue("bt");
		select.selectByValue("bw");

	}

}
