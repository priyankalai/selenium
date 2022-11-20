package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerttextBox {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

	WebElement Alretbtn = driver.findElement(By.xpath("//a[@href='#Textbox']"));
	
	Alretbtn.click();
	
	
	WebElement findElement2 = driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']"));
	findElement2.click();
	
	Thread.sleep(2000);
	
	Alert al = driver.switchTo().alert();
	
	al.sendKeys("iam kalai");
	
	al.getText();
	
	
	al.accept();
	
	
}
	
	
}

