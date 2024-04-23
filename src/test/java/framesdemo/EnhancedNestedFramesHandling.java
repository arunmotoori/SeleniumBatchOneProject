package framesdemo;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnhancedNestedFramesHandling {
	 public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        try {
	            driver.get("https://the-internet.herokuapp.com/nested_frames");
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	            driver.manage().window().maximize();
	            List<WebElement> frames = driver.findElements(By.tagName("frame"));
	            Iterator<WebElement> iterator = frames.iterator();
	            while (iterator.hasNext()) {
	                WebElement frame = iterator.next();
	                try {
	                    driver.switchTo().frame(frame);
	                    List<WebElement> innerFrames = driver.findElements(By.tagName("frame"));
	                    if (!innerFrames.isEmpty()) {
	                        Iterator<WebElement> innerIterator = innerFrames.iterator();
	                        while (innerIterator.hasNext()) {
	                            WebElement innerFrame = innerIterator.next();
	                            try {
	                                driver.switchTo().frame(innerFrame);

	                                // Get text from inner frame
	      
	                                WebElement body = driver.findElement(By.tagName("body"));
	                                String innerFrameText = body.getText();
	                                System.out.println("Inner frame text: " + innerFrameText);
	                                driver.switchTo().parentFrame();
	                            } catch (NoSuchFrameException e) {
	                                System.out.println("Inner frame not found");
	                            }
	                        }
	                    } else {
	                        // Get text from parent frame
	                        WebElement parentFrameBody = driver.findElement(By.tagName("body"));
	                        String parentFrameText = parentFrameBody.getText();
	                        System.out.println("Parent frame text: " + parentFrameText);
	                    }
	                } catch (NoSuchFrameException e) {
	                    System.out.println("Parent frame not found");
	                } finally {
	                    driver.switchTo().defaultContent();
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred");
	            e.printStackTrace();
	        } 
	        
	        driver.quit();
	        

	}

}






