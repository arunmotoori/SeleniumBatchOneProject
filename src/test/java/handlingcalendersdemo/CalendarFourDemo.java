package handlingcalendersdemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarFourDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in this format: dd/MM/yyyy");
		String userInput = scanner.nextLine();
		scanner.close();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(userInput, dtf);
		int day = ld.getDayOfMonth();
		String month = getMonth(userInput,dtf);
		int yearNumber = ld.getYear();
		String year = String.valueOf(yearNumber);

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		WebElement fourthDateField = driver.findElement(By.id("fourth_date_picker"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", fourthDateField);
		fourthDateField.click();
		
		WebElement monthDropDownField = driver.findElement(By.className("ui-datepicker-month"));
		Select select = new Select(monthDropDownField);
		select.selectByVisibleText(month);
		
		WebElement yearDropDownField = driver.findElement(By.className("ui-datepicker-year"));
		select = new Select(yearDropDownField);
		select.selectByVisibleText(year);
		
		String xpathText = "//td[@*='selectDay'][not(contains(@class,'ui-datepicker-other-month'))]/a[text()='"+day+"']";
		
		WebElement dayElement = driver.findElement(By.xpath(xpathText));
		dayElement.click();
	}
	
	public static String getMonth(String userInput,DateTimeFormatter dtf) {
		
		LocalDate ld = LocalDate.parse(userInput, dtf);
		int month = ld.getMonthValue();
		
		HashMap<Integer,String> hMap = new HashMap<>();
		hMap.put(1,"Jan");
		hMap.put(2,"Feb");
		hMap.put(3,"Mar");
		hMap.put(4,"Apr");
		hMap.put(5,"May");
		hMap.put(6,"Jun");
		hMap.put(7,"Jul");
		hMap.put(8,"Aug");
		hMap.put(9,"Sep");
		hMap.put(10,"Oct");
		hMap.put(11,"Nov");
		hMap.put(12,"Dec");
		
		return hMap.get(month);
	}

}
