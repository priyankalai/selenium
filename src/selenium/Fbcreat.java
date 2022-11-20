package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbcreat {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement btncreat = driver.findElement(By.xpath("//*[@rel='async']"));
				boolean enabled = btncreat.isEnabled();
				if (enabled==true) {
					btncreat.click();
				}
				
				Thread.sleep(10000);
				WebElement txtftnam = driver.findElement(By.xpath("//*[@name='firstname']"));
				boolean enabled2 = txtftnam.isEnabled();
				if (enabled2==true) {
					txtftnam.sendKeys("kalai");
					
							
				}
					      
				}
}
