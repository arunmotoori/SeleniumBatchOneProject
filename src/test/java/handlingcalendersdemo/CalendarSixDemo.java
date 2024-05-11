package handlingcalendersdemo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSixDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in this format: dd");
		String userInputDay = scanner.nextLine();
		scanner.close();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement calendarIcon = driver.findElement(By.className("ui-datepicker-trigger"));
		calendarIcon.click();
		
		String xpathText = "//td[@*='selectDay']/a[text()='"+userInputDay+"']";
		WebElement dayElement = driver.findElement(By.xpath(xpathText));
		dayElement.click();

	}

}
