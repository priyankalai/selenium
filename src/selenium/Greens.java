package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		Thread.sleep(3000);
		
		WebElement tabbtn = driver.findElement(By.xpath("//*[@id='overview-tab']/span[2]"));
		tabbtn.click();
		
		WebElement paratxt = driver.findElement(By.xpath("//*[@id='collapse661']/div/p"));
		String text = paratxt.getText();
		System.out.println(text);
		
		
		
		driver.quit();
		
		
	}

}
