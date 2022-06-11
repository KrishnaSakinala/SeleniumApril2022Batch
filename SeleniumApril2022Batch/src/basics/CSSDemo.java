package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser

		// navigate to specific URL/web site
		driver.get("http://demo.automationtesting.in");

		// to maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#email"));
		driver.findElement(By.cssSelector("input[id='email']"));
		driver.findElement(By.cssSelector("input[id='email'][ng-model='emailid']"));

	}
}