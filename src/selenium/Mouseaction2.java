package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Mouseact = driver.findElement(By.id("nav-link-amazonprime"));
			Actions ac=new Actions(driver);
		
			ac.moveToElement(Mouseact).perform();
			
			WebElement Mouseact2 = driver.findElement(By.id("multiasins-img-link"));
			
			ac.moveToElement(Mouseact2).perform();
			Mouseact2.click();
			System.out.println(Mouseact2);
			
			driver.quit();
			
}
			

}

