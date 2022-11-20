package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScript {
	
	
	 	public static void main(String[] args) {
		
	
	
	 			System.setProperty("webdriver.chrome.driver",
	 						"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	
	
	 				WebDriver driver = new ChromeDriver();
	 					driver.get("https://www.facebook.com/");
	 					driver.manage().window().maximize();
	
		
	 					WebElement txtuserName = driver.findElement(By.id("email"));
	 					

	 				    JavascriptExecutor js = (JavascriptExecutor) driver;
	 				    
	 					js.executeScript("arguments[0].setAttribute('value','username')",txtuserName);
	 					
	 				  Object ob = js.executeScript("return arguments[0].getAttribute('value')",txtuserName);
	 					String st = (String)ob;
	 					System.out.println(st);
	 					
	 					WebElement txtpass = driver.findElement(By.id("pass"));
	 					
	 					js.executeScript("arguments[0].setAttribute('value','kalai@123')", txtpass);
	 					WebElement btnclick = driver.findElement(By.name("login"));
	 					js.executeScript("arguments[0].click()", btnclick); 

}
	
}
