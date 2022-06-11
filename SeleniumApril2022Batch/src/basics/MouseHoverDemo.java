package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser
				
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement widgetsMenu = driver.findElement(By.linkText("Widgets"));
		
		Actions action = new Actions(driver);
		action.moveToElement(widgetsMenu).perform();
				
	}

}
