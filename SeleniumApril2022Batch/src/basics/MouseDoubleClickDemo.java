package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser
				
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.cssSelector("[ondblclick='myFunction()']"));
		
		Actions action = new Actions(driver); // to perform mouse actions
		//action.moveToElement(element).doubleClick().perform();
		action.doubleClick(element).perform();
				
	}

}
