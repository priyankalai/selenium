package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo/");
		
		WebElement txtsrch = driver.findElement(By.id("twotabsearchtextbox"));
		 boolean enabled = txtsrch.isEnabled();
		 if (enabled== true) {
			 txtsrch.sendKeys("airpodes");
			 
	//		 WebElement txtsrclik = driver.findElement(By.xpath("//div[@aria-label=\'airpods\']"));
	//		 txtsrclik.click();
			 
			 WebElement txtlink = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
			 boolean enabled2 = txtlink.isEnabled();
			 if (enabled2== true) {
				 txtlink.click();
				 
				 Thread.sleep(5000);
				 
				 
				 WebElement slectmb = driver.findElement(By.xpath("//*[@id=\"contentGrid_57942\"]/div/div[2]/div[6]/div/div/a/img"));
				 boolean enabled3 = slectmb.isEnabled();
				 if (enabled3== true) {
					 slectmb.click();
					
				}
				
			}
		}
			}

}
