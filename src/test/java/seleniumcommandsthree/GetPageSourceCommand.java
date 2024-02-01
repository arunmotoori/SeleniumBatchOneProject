package seleniumcommandsthree;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceCommand {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/basic_web_page.html");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.quit();

	}

}
