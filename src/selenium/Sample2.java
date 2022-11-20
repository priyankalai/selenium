package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		 WebElement txtusername = driver.findElement(By.id("username"));
			txtusername.sendKeys("kalaipriyan");
			
			
			WebElement txtpassword = driver.findElement(By.id("password"));
			  txtpassword.sendKeys("kal53@");
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		 
		WebElement txtword = driver.findElement(By.xpath("//p[text()='Adactin Launches The Adactin Hotel App! ']"));
		String text = txtword.getText();
		System.out.println(text);
		
		
		
		 
		
		 
		
		
		
		
		
	}

}
