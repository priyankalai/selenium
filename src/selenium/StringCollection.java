package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StringCollection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
		
			driver.get("https://demo.mobiscroll.com/select/multiple-select");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			WebElement catagory = driver.findElement(By.xpath("//select[@id='multiple-select-select']"));
			
			Select se = new Select(catagory);
			boolean multiple = se.isMultiple();
			System.out.println(multiple);
			
			Thread.sleep(5000);
		
			WebElement btnbk = driver.findElement(By.xpath("//div[@role='option'][41]"));
			btnbk.click();
			
				
			}
				
}
			
					


	