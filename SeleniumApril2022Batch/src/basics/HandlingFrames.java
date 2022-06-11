package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser
				
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		
		//1. using WebElement		
		//driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		
		// 2. using id or name
		//driver.switchTo().frame("SingleFrame");
		
		//3. using index
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("a[href='#Multiple']")).click();
		
		
	}

}
