package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
		
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			List<WebElement> findElements = driver.findElements(By.id("em"));
			
			if (findElements.size()>=1) {
				findElements.get(findElements.size()).sendKeys("Welcome");
			}
			
			WebElement fbpass = driver.findElement(By.id("pass"));
			
			fbpass.sendKeys("3468@");
			
			
		
		
	}

}
