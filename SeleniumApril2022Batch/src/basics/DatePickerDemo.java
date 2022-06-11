package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser
				
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		//driver.findElement(By.id("datepicker1")).sendKeys("01/01/1980");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker1').value='01/01/1980'");
		
		driver.findElement(By.id("datepicker2")).sendKeys("01/01/1980");
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('#datepicker1').value='05/05/1985'");
		
	}
}