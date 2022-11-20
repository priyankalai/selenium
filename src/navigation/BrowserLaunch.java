package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//  maximize the browser
		driver.manage().window().maximize();
		//launch URl by using navigation commands
		driver.navigate().to("https://en-gb.facebook.com/");
		
		//To move backward
		driver.navigate().back();
		
		//to move forward
		driver.navigate().forward();
		
		//to reload the page
		driver.navigate().refresh();
		
	
	}

}
