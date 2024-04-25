package actionsmousekeyboardeventsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement osloCapital = driver.findElement(By.id("box1"));
		WebElement norwayCountry = driver.findElement(By.id("box101"));
		WebElement romeCapital = driver.findElement(By.id("box6"));
		WebElement italyCountry = driver.findElement(By.id("box106"));
		WebElement WashingtonCapital = driver.findElement(By.id("box3"));
		WebElement unitedStatesCountry = driver.findElement(By.id("box103"));
		WebElement seoulCapital = driver.findElement(By.id("box5"));
		WebElement southKoreaCountry = driver.findElement(By.id("box105"));
		WebElement stockholmCapital = driver.findElement(By.id("box2"));
		WebElement swedenCountry = driver.findElement(By.id("box102"));
		WebElement copenhagenCaptial = driver.findElement(By.id("box4"));
		WebElement denmarkCoutry = driver.findElement(By.id("box104"));
		WebElement madridCapital = driver.findElement(By.id("box7"));
		WebElement spainCountry = driver.findElement(By.id("box107"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(osloCapital, norwayCountry).perform();
		actions.dragAndDrop(romeCapital, italyCountry).perform();
		actions.dragAndDrop(WashingtonCapital, unitedStatesCountry).perform();
		actions.dragAndDrop(seoulCapital, southKoreaCountry).perform();
		actions.dragAndDrop(stockholmCapital, swedenCountry).perform();
		actions.dragAndDrop(copenhagenCaptial, denmarkCoutry).perform();
		actions.dragAndDrop(madridCapital, spainCountry).perform();
		

	}

}
