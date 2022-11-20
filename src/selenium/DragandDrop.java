package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		WebElement drageelement = driver.findElement(By.id("credit2"));
		
		WebElement dropelement = driver.findElement(By.id("bank"));
		
		WebElement amtdrag = driver.findElement(By.id("fourth"));
		
		WebElement amtdrop = driver.findElement(By.id("amt7"));
		
		WebElement drageele = driver.findElement(By.id("credit1"));
		
		WebElement dropele = driver.findElement(By.id("loan"));
		
		WebElement amtdrag2 = driver.findElement(By.id("fourth"));
		
		WebElement amtdrop2 = driver.findElement(By.id("amt8"));
		
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(drageelement,dropelement).perform();
		
		ac.dragAndDrop(amtdrag, amtdrop).perform();
		
		ac.dragAndDrop(drageele, dropele).perform();
		
		ac.dragAndDrop(amtdrag2, amtdrop2).perform();
		
		
				
}
}
