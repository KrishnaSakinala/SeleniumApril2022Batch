package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver(); // open chrome browser
		
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); // open firefox browser
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#OKTab >button")).click();
		
		Thread.sleep(5000);
		
		/*Alert alt = driver.switchTo().alert();
		alt.accept();  // clicking on OK button*/
		
		driver.switchTo().alert().accept(); // click on OK button
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.cssSelector("#CancelTab >button")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss(); // click on Cancel button
		String text = driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.cssSelector("#Textbox>button")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().sendKeys("Selenium Tester");
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
	}

}
