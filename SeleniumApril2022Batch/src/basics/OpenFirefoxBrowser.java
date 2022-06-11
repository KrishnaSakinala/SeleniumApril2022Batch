package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); // open firefox browser
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		

	}

}
