package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			
				driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.7");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				
		//		WebElement tophead = driver.findElement(By.xpath("//*[text()='Apache Commons IO']"));
				
				
				WebElement scrolldown = driver.findElement(By.xpath("//td[text()='Apache License, Version 2.0']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
				
				WebElement scrollUp = driver.findElement(By.xpath("//a[text()='Apache Commons IO']"));
				Thread.sleep(3000);
				
				js.executeScript("arguments[0].scrollIntoView(false)",scrollUp);
				
				
				
	}

}
