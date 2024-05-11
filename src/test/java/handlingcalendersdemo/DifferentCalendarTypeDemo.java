package handlingcalendersdemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentCalendarTypeDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date and time in this format: dd/MM/yyyy HH:mm");
		String userInput = scanner.nextLine();
		scanner.close();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime ldt = LocalDateTime.parse(userInput, dtf);
		int day = ldt.getDayOfMonth();
		int month = ldt.getMonthValue();
		int year = ldt.getYear();
		String daymonthyear = ""+day+month+year;
		int hour = ldt.getHour();
		int minute = ldt.getMinute();
		String hourminute = ""+hour+minute;
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/");
		
		WebElement dateField = driver.findElement(By.name("bdaytime"));
		dateField.sendKeys(daymonthyear);
		dateField.sendKeys(Keys.TAB);
		dateField.sendKeys(hourminute);

	}

}
