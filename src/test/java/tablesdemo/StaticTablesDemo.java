package tablesdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTablesDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
//		List<WebElement> tableHeadings = driver.findElements(By.xpath("//table[@id='table1']//th"));
//		
//		for(WebElement tableHeading : tableHeadings) {
//			System.out.println(tableHeading.getText());
//		}
		
//		List<WebElement> tableDatas = driver.findElements(By.xpath("//table[@id='table1']//td"));
//		
//		for(WebElement tableData : tableDatas) {
//			System.out.println(tableData.getText());
//		}
		
//		List<WebElement> tablehds = driver.findElements(By.xpath("//table[@id='table1']//tr/*"));
//		
//		for(WebElement tablehd : tablehds) {
//			System.out.println(tablehd.getText());
//		}
		
//		List<WebElement> secondRowDatas = driver.findElements(By.xpath("//table[@id='table1']//tr[2]/td"));
//		
//		for(WebElement data : secondRowDatas) {
//			System.out.println(data.getText());
//		}
		
//		List<WebElement> thirdColumnDatas = driver.findElements(By.xpath("//table[@id='table1']//tr/td[3]"));
//		
//		for(WebElement data : thirdColumnDatas) {
//			System.out.println(data.getText());
//		}
		
//		List<WebElement> secondRowSecondColumn = driver.findElements(By.xpath("//table[@id='table1']//tr[2]//td[2]"));
//		
//		for(WebElement data : secondRowSecondColumn) {
//			System.out.println(data.getText());
//		}
		
//		List<WebElement> fourthRowThirdColumn = driver.findElements(By.xpath("//table[@id='table1']//tr[4]//td[3]"));
//		
//		for(WebElement data : fourthRowThirdColumn) {
//			System.out.println(data.getText());
//		}
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		
		int rowCount = rows.size();
		
		System.out.println(rowCount);
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']//th"));
		
		int colCount = cols.size();
		
		System.out.println(colCount);
		
		driver.quit();
		

	}

}
