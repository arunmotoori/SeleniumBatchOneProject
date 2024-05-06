package handlingcalendersdemo;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSimpleCalendarUsingReusalbeMethod {

	public static void main(String[] args) throws ParseException {
		
		String expectedDate = collectDateFromUserAsInput();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rb.gy/xiehud");
		selectRequiredDateInCalendar(driver,expectedDate);
			
	}
	
	public static String collectDateFromUserAsInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in this format dd/MM/yyyy:");  // "25/11/2027"
		String expectedDate = scanner.nextLine();
		scanner.close();
		return expectedDate;
	}
	
	public static void selectRequiredDateInCalendar(ChromeDriver driver,String expectedDate) {
		
		String expectedMonth = getMonthFromEnteredDate(expectedDate);
		String expectedYear = getYearFromEnteredDate(expectedDate);
		String expectedDay = getDayFromEnteredDate(expectedDate);
		
		WebElement datePickerField = driver.findElement(By.id("datepicker"));
		datePickerField.click();
		
		WebElement currentMonthElement = driver.findElement(By.className("ui-datepicker-month"));
		WebElement currentYearElement = driver.findElement(By.className("ui-datepicker-year"));
		
		String currentMonth = currentMonthElement.getText();
		String currentYear = currentYearElement.getText();

		
		while(!(currentMonth.equalsIgnoreCase(expectedMonth) && currentYear.equals(expectedYear))) {
			
			WebElement nextOption = driver.findElement(By.xpath("//a[@title='Next']"));
			nextOption.click();
			
			currentMonthElement = driver.findElement(By.className("ui-datepicker-month"));
			currentYearElement = driver.findElement(By.className("ui-datepicker-year"));
			currentMonth = currentMonthElement.getText();
			currentYear = currentYearElement.getText();
		}
		
		String xpathText = "//td[@*='selectDay']/a[text()='"+expectedDay+"']";
		
		WebElement expectedDateElement = driver.findElement(By.xpath(xpathText));
		expectedDateElement.click();
		
		
	}
	
	public static String getMonthFromEnteredDate(String userEnteredDate) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(userEnteredDate, dtf);
		
		Month month = ld.getMonth();
		String expectedMonth = month.toString();
		System.out.println(expectedMonth);
		
		return expectedMonth;
	}
	
	public static String getYearFromEnteredDate(String userEnteredDate) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(userEnteredDate, dtf);
		
		int year = ld.getYear();  // 2027
		String expectedYear = String.valueOf(year);  // "2027"
		return expectedYear;
		
	}
	
	public static String getDayFromEnteredDate(String userEnteredDate) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(userEnteredDate, dtf);
		
		int day = ld.getDayOfMonth(); // 25
		String expectedDay = String.valueOf(day);  //"25" 

		return expectedDay;
	}

}
