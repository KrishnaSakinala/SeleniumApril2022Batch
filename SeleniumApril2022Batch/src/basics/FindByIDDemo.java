package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindByIDDemo {

	@Test
	public void findByIdDemo() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser

		// navigate to specific URL/web site
		driver.get("http://demo.automationtesting.in");

		// to maximize the browser
		driver.manage().window().maximize();

		// find the element by id
		driver.findElement(By.id("email"));

		driver.get("http://demo.automationtesting.in/Register.html");

		// find element by class
		driver.findElement(By.className("checks"));

		//driver.get("http://demo.automationtesting.in");

		// find element by link text
		driver.findElement(By.linkText("WebTable"));
		
		// find element by partial link text
		driver.findElement(By.partialLinkText("WebTab"));
		
		// find element by tag name
		driver.findElement(By.tagName("input"));

	}

}
