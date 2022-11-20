package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtusername = driver.findElement(By.id("email"));
		boolean enabled = txtusername.isEnabled();
		if (enabled==true) {
			txtusername.sendKeys("kalaipriyan");
			
		} else {
			System.out.println("text use name not enable");
	}
		Thread.sleep(3000);
		
		WebElement txtpassbox = driver.findElement(By.id("pass"));
		boolean enabled2 = txtpassbox.isEnabled();
		if (enabled2==true) {
			txtpassbox.sendKeys("9876@df");
			
		}

		Thread.sleep(3000);
		
		WebElement loginbtn = driver.findElement(By.xpath("//button"));
		boolean enabled3 = loginbtn.isEnabled();
		if (enabled3==true) {
			loginbtn.click();
			
		}
		
		}
	}


