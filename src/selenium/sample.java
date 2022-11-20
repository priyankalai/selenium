package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		// launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Enter the URL
		driver.get("https://en-gb.facebook.com/");
		 
		
		// To get the Title of the page
        	String title = driver.getTitle();   //ctrl+2 l
		System.out.println(title);
		
		//current URL of the page 
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		 WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("kalaipriyan");
		
	
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		  txtpassword.sendKeys("kal53@");
		  
	  WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
		  btnlogin.click();
		  
		  
		  
		//to exit the Browser
	
	}

}
