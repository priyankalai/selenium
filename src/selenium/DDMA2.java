package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DDMA2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement btnquit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnquit.click();
		
		
		WebElement Mouseact = driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(Mouseact).perform();
		Mouseact.click();
		
		WebElement Mouseact2 = driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
		ac.moveToElement(Mouseact2).perform();
		
		WebElement Mouseact3 = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		ac.moveToElement(Mouseact3).perform();
		
		WebElement Mouseact4 = driver.findElement(By.xpath("//a[@title='Bath Towels']"));
	//	ac.moveToElement(Mouseact4).perform();
		Mouseact4.click();
		
		WebElement Mouseact5 = driver.findElement(By.xpath("//*[text()='TRIDENT Cotton 460 GSM Hand Towel Set']"));
	//	ac.moveToElement(Mouseact5).perform();
		Mouseact5.click();
		
		String text = Mouseact5.getText();
		System.out.println(text);
		
		
		
		
		
		
}

}
