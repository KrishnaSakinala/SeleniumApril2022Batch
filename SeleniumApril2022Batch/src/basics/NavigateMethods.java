package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser

		// navigate to specific URL/web site
		driver.get("http://automationtesting.in/");

		// to maximize the browser
		driver.manage().window().maximize();

		// print the page title
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		// print page URL
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);

		driver.findElement(By.linkText("TestNG")).click();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// navigate back
		driver.navigate().back();
		System.out.println("--------after navigate back--------");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// navigate forward
		driver.navigate().forward();
		System.out.println("--------after navigate forward--------");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// press F5 on the keyboard
		driver.navigate().refresh();

	}

}
