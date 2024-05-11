package handlingcalendersdemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingPreviousAndFutureDatesCalendarDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Date in this format dd/MM/yyyy");
		String userInput = scanner.nextLine();
		scanner.close();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.click();
		
		goTillYear(driver,userInput);
		goToMonth(driver,userInput);
		selectDay(driver,userInput);
		
	}
	
	public static void selectDay(ChromeDriver driver,String userInput) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(userInput, dtf);
		
		int expectedDay = ld.getDayOfMonth();
		
		String xpathText = "//td[@*='selectDay']/a[text()='"+expectedDay+"']";
		
		WebElement dayElement = driver.findElement(By.xpath(xpathText));
		dayElement.click();
	}

	public static void goTillYear(ChromeDriver driver, String userInput) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(userInput, dtf);
		
		int expectedYear = ld.getYear();
		
		WebElement currentYearElement = driver.findElement(By.className("ui-datepicker-year"));
		String currentYearText = currentYearElement.getText();
		int currentYear = Integer.parseInt(currentYearText);

		if (currentYear < expectedYear) {

			while (currentYear != expectedYear) {
				WebElement nextOption = driver.findElement(By.xpath("//a[@title='Next']"));
				nextOption.click();
				currentYearElement = driver.findElement(By.className("ui-datepicker-year"));
				currentYearText = currentYearElement.getText();
				currentYear = Integer.parseInt(currentYearText);
			}

		} else if (currentYear > expectedYear) {

			while (currentYear != expectedYear) {
				WebElement previousOption = driver.findElement(By.xpath("//a[@title='Prev']"));
				previousOption.click();
				currentYearElement = driver.findElement(By.className("ui-datepicker-year"));
				currentYearText = currentYearElement.getText();
				currentYear = Integer.parseInt(currentYearText);
			}

		}

	}
	
	public static void goToMonth(ChromeDriver driver,String userInput) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(userInput, dtf);

		int expectedMonth = ld.getMonthValue();
		
		WebElement currentMonthElement = driver.findElement(By.className("ui-datepicker-month"));
		String currentMonthText = currentMonthElement.getText();
		int currentMonth = getMonthNumber(currentMonthText);

		if (currentMonth < expectedMonth) {

			while (currentMonth != expectedMonth) {
				WebElement nextOption = driver.findElement(By.xpath("//a[@title='Next']"));
				nextOption.click();
				currentMonthElement = driver.findElement(By.className("ui-datepicker-month"));
				currentMonthText = currentMonthElement.getText();
				currentMonth = getMonthNumber(currentMonthText);
			}

		} else if (currentMonth > expectedMonth) {

			while (currentMonth != expectedMonth) {
				WebElement previousOption = driver.findElement(By.xpath("//a[@title='Prev']"));
				previousOption.click();
				currentMonthElement = driver.findElement(By.className("ui-datepicker-month"));
				currentMonthText = currentMonthElement.getText();
				currentMonth = getMonthNumber(currentMonthText);
			}

		}
		
	}
	
	public static int getMonthNumber(String currentMonth) {
		
		Month month = Month.valueOf(currentMonth.toUpperCase());
		int m = month.getValue();
		return m;
		
		/*
		HashMap<String, Integer> hMap = new HashMap<>();
		hMap.put("January", 1);
		hMap.put("February", 2);
		hMap.put("March", 3);
		hMap.put("April", 4);
		hMap.put("May", 5);
		hMap.put("June", 6);
		hMap.put("July", 7);
		hMap.put("August", 8);
		hMap.put("September", 9);
		hMap.put("October", 10);
		hMap.put("November", 11);
		hMap.put("December", 12);
		
		return hMap.get(currentMonth);
		
		*/
		
	}

}
