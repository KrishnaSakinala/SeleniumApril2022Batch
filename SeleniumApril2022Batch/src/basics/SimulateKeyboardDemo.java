package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimulateKeyboardDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser
				
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.id("target"));
		
		element.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		element.sendKeys(Keys.NUMPAD7);
		
		Thread.sleep(3000);
		element.sendKeys(Keys.ENTER);
	}
}