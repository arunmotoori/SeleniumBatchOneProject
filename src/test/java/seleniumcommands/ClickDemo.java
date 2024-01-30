package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("radio1")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkbox1")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkbox2")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ta1")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("link1")).click();
		
	
	}

}
