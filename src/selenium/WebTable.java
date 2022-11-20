package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91638\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
				driver.get("https://www.icc-cricket.com/world-test-championship/standings");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				
				WebElement table = driver.findElement(By.xpath("//table[@class='standings-wtc--table']"));
				
				WebElement heading = driver.findElement(By.xpath("//tr[@class='standings-wtc__table-head']"));
				
				List<WebElement> headingelements = heading.findElements(By.tagName("th"));
				//iterate the list
				for (int i = 0; i < headingelements.size(); i++) {
					//individual heading
					WebElement individualheading = headingelements.get(i);
					System.out.println(individualheading.getText());
					
				//from the webtable locate the body or contant	
					WebElement tablebd = table.findElement(By.tagName("tbody"));
					
					//from the tbody find the multiple rows
					
					List<WebElement> rows = table.findElements(By.tagName("tr"));
					
					//iterate the rows individual rows
					
					for (int j = 0; j < rows.size(); j++) {
						
						WebElement row = rows.get(j);
						
					// from the row locates the multiple elements 
						List<WebElement> columns = row.findElements(By.tagName("td"));
						for (int k = 0; k < columns.size(); k++) {
							WebElement column = columns.get(k);
							System.out.println(column.getText());
							
						}
						
					}
					
				}
				
	
	

}

}
