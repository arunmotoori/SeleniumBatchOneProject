package tablesdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingEntireTableDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
		List<WebElement> rowsElements = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int rows = rowsElements.size();
		
		List<WebElement> headingElements = driver.findElements(By.xpath("//table[@id='table1']//th"));
		int cols = headingElements.size();
		
		for(int r=1;r<=rows;r++) {  // 6
			
			if(r==1) {
				
				for(int c=1;c<=cols;c++) {  // 4
					
					String xpathText = "//table[@id='table1']//th["+c+"]";
					WebElement tableHeading = driver.findElement(By.xpath(xpathText));
					String tableHeadingText = tableHeading.getText();
					System.out.print(tableHeadingText+" ");
				}
				
				System.out.println();
				
			}else {
				
				for(int c=1;c<=cols;c++) {  // 1
					
						String xpathText = "//table[@id='table1']//tr["+(r-1)+"]//td["+c+"]";
						WebElement tableData = driver.findElement(By.xpath(xpathText));
						String tableDataText = tableData.getText();
						System.out.print(tableDataText+" ");
				
				}
				
				
				System.out.println();
				
			}
		
		}
		
		/*
		List<WebElement> tabledh = driver.findElements(By.xpath("//table[@id='table1']//tr/*"));
		
		for(WebElement dh : tabledh) {
			
			System.out.println(dh.getText());
			
		}*/
		
		driver.quit();
		
	}

}
