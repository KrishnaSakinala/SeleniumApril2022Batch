package basics;

import java.util.concurrent.ConcurrentSkipListSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser

		// navigate to specific URL/web site
		driver.get("http://demo.automationtesting.in/Register.html");

		// to maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		Select skillsDropdown = new Select(driver.findElement(By.id("Skills")));
		//1. selectByIdex()
		skillsDropdown.selectByIndex(5);
		
		Thread.sleep(10000);

		//2. selectByVisibleText()
		skillsDropdown.selectByVisibleText("CSS");
		
		Thread.sleep(5000);
		
		//3. selectByValue
		skillsDropdown.selectByValue("Email");
		

	}

}
