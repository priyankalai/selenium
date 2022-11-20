package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement mouseHoverAction = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions ac=new Actions(driver);
		
		ac.moveToElement(mouseHoverAction).perform();
		
		WebElement mouse2 = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		ac.moveToElement(mouse2).perform();
		
		WebElement mouse3 = driver.findElement(By.xpath("//span[text()='Performance Tuning']"));
		 ac.moveToElement(mouse3).perform();
		 mouse3.click();
		
	}

}
