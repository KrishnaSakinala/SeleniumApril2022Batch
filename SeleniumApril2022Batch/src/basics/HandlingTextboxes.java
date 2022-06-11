package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser

		// navigate to specific URL/web site
		driver.get("http://demo.automationtesting.in/Register.html");

		// to maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Krishna");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Sakinala");
		driver.findElement(By.tagName("textarea")).sendKeys("Hyderabad");
		
		WebElement firstNameTextbox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstNameTextbox.clear();
		firstNameTextbox.sendKeys("Manik");
		
		
		
	}

}
