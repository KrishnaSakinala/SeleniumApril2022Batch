package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebTable {

	static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); // open chrome browser

		// navigate to specific URL/web site
		driver.get("https://datatables.net/examples/styling/display.html");

		// to maximize the browser
		driver.manage().window().maximize();
		
		//table[@id='example']/tbody/tr[7]/td[6]
		// get the row number dynamically with the help of name
		
		int colNumber = 0;
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));
		
		for(WebElement head : headers) {
			colNumber++;
			if(head.getText().equals("Salary")) {
				break;
			}
		}
		
		
		
		int rowNumber = 0;
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
		
		for(WebElement name : names) {
			
			rowNumber++;
			if(name.getText().equals("Angelica Ramos")) {
				break;
			}
		}
		
		
		String salary = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowNumber+"]/td["+colNumber+"]")).getText();
		System.out.println(salary);
	}
}