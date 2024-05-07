package handlingcalendersdemo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingDateInActiveDateCalendarDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any date in dd/MM/yyyy format:");
		String userInput = scanner.nextLine();  // "25/11/2029"
		scanner.close();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companion/");
		
		WebElement dateField = driver.findElement(By.id("form-field-travel_comp_date"));
		WebElement sortOption = driver.findElement(By.className("p2u_sortby"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()",sortOption);
		Thread.sleep(10000);
		dateField.click();
		
		
		//For selecting todays date in this calendar
//		WebElement todaysDate = driver.findElement(By.xpath("//span[@class='flatpickr-day today']"));
//		todaysDate.click();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(userInput, dtf);
		
		int day = ld.getDayOfMonth();
		int month = ld.getMonthValue();  //03
		//System.out.println(month); // 3
		int year = ld.getYear(); // 2029
		String yearText = String.valueOf(year);
		
		WebElement currentYearElement = driver.findElement(By.xpath("//input[@class='numInput cur-year']"));
//		String currentYearText = currentYearElement.getAttribute("min"); 
//		int currentYear = Integer.parseInt(currentYearText); // 2024
		currentYearElement.clear();
		currentYearElement.sendKeys(yearText);
	
		WebElement currentMonthElement = driver.findElement(By.className("cur-month"));
		String currentMonthTextOrig =currentMonthElement.getText();
		String currentMonthText = currentMonthTextOrig.trim();  //"May"
		Month currentMonthX = Month.valueOf(currentMonthText.toUpperCase());
		int currentMonth = currentMonthX.getValue();
		//System.out.println(currentMonth);  // 5
		
		if(month>currentMonth) {
			while(currentMonth!=month) {
				WebElement nextArrow = driver.findElement(By.xpath("//span[@class='flatpickr-next-month']//*[name()='svg']"));
				nextArrow.click();
				Thread.sleep(1000);
				currentMonthElement = driver.findElement(By.className("cur-month"));
				currentMonthTextOrig = (String)jse.executeScript("return arguments[0].innerText", currentMonthElement);
				currentMonthText = currentMonthTextOrig.trim();
				currentMonthX = Month.valueOf(currentMonthText.toUpperCase());
				currentMonth = currentMonthX.getValue();
				Thread.sleep(1000);
			}
			
		}else if(month<currentMonth) {
			while(currentMonth!=month) {
				WebElement previousArrow = driver.findElement(By.xpath("//span[@class='flatpickr-prev-month']//*[name()='svg']"));
				previousArrow.click();
				Thread.sleep(1000);
				currentMonthElement = driver.findElement(By.className("cur-month"));
				currentMonthTextOrig = (String)jse.executeScript("return arguments[0].innerText", currentMonthElement);
				currentMonthText = currentMonthTextOrig.trim();
				currentMonthX = Month.valueOf(currentMonthText.toUpperCase());
				currentMonth = currentMonthX.getValue();
				Thread.sleep(1000);
			}
		}
		

		/*
		while(currentYear!=year) {
			WebElement arrowUpElement = driver.findElement(By.className("arrowUp"));
			Thread.sleep(1000);
			arrowUpElement.click();
			Thread.sleep(1000);
			currentYearElement = driver.findElement(By.xpath("//input[@class='numInput cur-year']"));
			currentYearText = (String)jse.executeScript("return arguments[0].value", currentYearElement);
			currentYear = Integer.parseInt(currentYearText);
			//			currentYearElement = driver.findElement(By.xpath("//input[@class='numInput cur-year']"));
//			currentYearText = currentYearElement.getAttribute("min");
//			currentYear = Integer.parseInt(currentYearText);
		}*/
		
		String dayText = String.valueOf(day);
		List<WebElement> activeDays = driver.findElements(By.xpath("//span[@class='flatpickr-day today' or @class='flatpickr-day ']"));
		int count = 0;
		for(WebElement activeDay : activeDays) {
			if(activeDay.getText().equals(dayText)){
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
