package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeenShort {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
	
				TakesScreenshot ts = (TakesScreenshot) driver;
				
				File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
				
				System.out.println(screenshotAs);
				
				File File = new File("C:\\Users\\91638\\eclipse-workspace\\selenium\\screen\\greens.png");
				
				FileUtils.copyFile(screenshotAs,File);
				
				driver.quit();
	}
	
}
