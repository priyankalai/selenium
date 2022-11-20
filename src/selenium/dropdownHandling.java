package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		driver.get("https://www.facebook.com/");
		

		WebElement btnCreat = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		btnCreat.click();
		
		Thread.sleep(5000);
		
		WebElement FstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FstName.sendKeys("kalai");
		
		Thread.sleep(5000);
		
		WebElement dropday = driver.findElement(By.id("day"));
		
		Select select = new Select (dropday);
		select.selectByValue("5");
		
		WebElement dropmonth = driver.findElement(By.id("month"));
		
		Select sm = new Select(dropmonth);
		sm.selectByVisibleText("Sep");
		
		WebElement dropyear = driver.findElement(By.id("year"));
		
		Select sy = new Select(dropyear);
		sy.selectByIndex(26);
		
		
		
		
		
		
		
		
		
	}

}
