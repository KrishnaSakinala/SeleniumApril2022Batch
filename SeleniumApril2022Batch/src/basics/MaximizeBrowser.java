package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser

		// navigate to specific URL/web site
		driver.get("http://demo.automationtesting.in/Register.html");

		// to maximize the browser
		driver.manage().window().maximize();

	}

}
