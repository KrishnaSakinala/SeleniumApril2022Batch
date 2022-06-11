package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownsWithoutSelectClass {

	static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); // open chrome browser

		// navigate to specific URL/web site
		driver.get("https://the-internet.herokuapp.com/dropdown");

		// to maximize the browser
		driver.manage().window().maximize();
		
		selectValueFromDropdown("dropdown", "#dropdown >option", "Option 2");
		
		Thread.sleep(5000);

		selectValueFromDropdown("dropdown", "#dropdown >option", "Option 1");
		
		//driver.findElement(By.id("dropdown")).click();
		
		/*
		// find multiple elements
		List<WebElement> options = driver.findElements(By.cssSelector("#dropdown >option"));
		
		// now the count of elements
		System.out.println("Options count: " + options.size());
		
		// desired value is java
		for(WebElement option : options) {
			if(option.getText().equals("Option 1")) {
				option.click();
			}
		}
		*/

	}
	
	public static void selectValueFromDropdown(String dropdownLocator, String dropdownValuesLocator, String desiredValue) {
		
		driver.findElement(By.id(dropdownLocator)).click();
		
		//find multiple elements
		List<WebElement> options = driver.findElements(By.cssSelector(dropdownValuesLocator));
		
		// now the count of elements
		System.out.println("Options count: " + options.size());
		
		// desired value is java
		for(WebElement option : options) {
			if(option.getText().equals(desiredValue)) {
				option.click();
			}
		}
	}

}
