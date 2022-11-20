package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
		
			driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			WebElement frame = driver.findElement(By.xpath("//frame[@name='\"Continue to Login']"));
			driver.switchTo().frame(frame);
			
			

}
}
