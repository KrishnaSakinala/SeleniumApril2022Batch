package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser

		// navigate to specific URL/web site
		driver.get("http://demo.automationtesting.in");

		// to maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/input"));
		driver.findElement(By.xpath("//input[@id='email']"));
		driver.findElement(By.xpath("//input[@id='email'][@ng-model='emailid']"));

	}

}
