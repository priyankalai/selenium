package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alret {
	

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement findElement = driver.findElement(By.xpath("//*[text()='Alert with OK ']"));
	
	findElement.click();
	
	WebElement findElement2 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	findElement2.click();
	
	Thread.sleep(2000);
	
	Alert alert =driver.switchTo().alert();
	
	alert.accept();
	
	
	
	
	
}

}
	