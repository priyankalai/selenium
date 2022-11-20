package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
				driver.get("https://en-gb.facebook.com/");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				
				WebElement btnCreat = driver.findElement(By.xpath("//*[text()='Create New Account']"));
				btnCreat.click();
				
				Thread.sleep(5000);
				WebElement dropmonth = driver.findElement(By.id("month"));
				
				Select sm = new Select(dropmonth);
				sm.selectByVisibleText("Sep");
				
				List<WebElement> options = sm.getOptions();
				
				int size = options.size();
				System.out.println(size);
				
				for (int i = 0 ; i < options.size(); i++) {
					WebElement ele = options.get(i);
					String text = ele.getText();
					System.out.println("text value  :"+text);
					
					String attribute = ele.getAttribute("value");
					System.out.println("Attribute value  :"+attribute);
					
				}
				

}

}
