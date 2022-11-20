package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class boserlaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);

}
	
}
