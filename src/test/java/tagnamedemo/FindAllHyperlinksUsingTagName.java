package tagnamedemo;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllHyperlinksUsingTagName {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		//HashMap<String,String> hmap = new HashMap<String,String>();
		
		for(WebElement link : links) {
			
			//hmap.put(link.getText(), link.getAttribute("href"));
			
			System.out.println(link.getText()+" : "+link.getAttribute("href"));
			
		}
		
		//System.out.println(hmap);
		
		driver.quit();

	}

}
