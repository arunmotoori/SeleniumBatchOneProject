package handlingcalendersdemo;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingDateInActiveDateCalendarDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any day number in this month:");
		String day = scanner.nextLine();
		scanner.close();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companion/");
		
		WebElement dateField = driver.findElement(By.id("form-field-travel_comp_date"));
		WebElement sortOption = driver.findElement(By.className("p2u_sortby"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()",sortOption);
		dateField.click();
		
		//For selecting todays date in this calendar
//		WebElement todaysDate = driver.findElement(By.xpath("//span[@class='flatpickr-day today']"));
//		todaysDate.click();
	
		List<WebElement> activeDays = driver.findElements(By.xpath("//span[@class='flatpickr-day today' or @class='flatpickr-day ']"));
		int count = 0;
		for(WebElement activeDay : activeDays) {
			if(activeDay.getText().equals(day)){
				count++;
				activeDay.click();
				break;
			}
		}
		
		if(count<1)
			System.out.println("The given day is not an active date. Hence can't be selected in the calendar");
		
		//Now, we have to select Month and Year in the calendar
		
	}

}
