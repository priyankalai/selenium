package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclueqns4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement mouseact = driver.findElement(By.xpath("//*[text()='Mobiles & More']"));
		
		Actions ac = new Actions (driver);
		
		ac.moveToElement(mouseact).perform();
		
		WebElement clicklink = driver.findElement(By.xpath("//*[text()='Smartphones & Tablets']"));
		clicklink.click();
		
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='2501 - 5000']"));
		boolean enabled = checkbox.isEnabled();
		if (enabled==true) {
				
		}
		checkbox.click();
		
		checkbox.getText();
		
		
		driver.quit();
		
		
		
		

}
	
}
