package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
			searchbox.sendKeys("iphone",Keys.ENTER);
			
			WebElement iphoneclick = driver.findElement(By.xpath("//*[text()='Apple iPhone 12 (128GB) - Blue']"));
			iphoneclick.click();
			
			String prtwin = driver.getWindowHandle();
			System.out.println(prtwin);
			
			Set<String> allwin = driver.getWindowHandles();
			System.out.println(allwin);
			for(String string : allwin) {
			if (!prtwin.equals(string)) {
				driver.switchTo().window(string);
			}
	}

			WebElement btnaddclick = driver.findElement(By.id("add-to-cart-button"));
			btnaddclick.click();
}
	
}
