package basics;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser
				
		driver.get("http://demo.automationtesting.in/Loader.html");
		
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Thread.sleep(3000);
		
		driver.findElement(By.id("loader")).click();
		
		//Thread.sleep(60000);
		
		Wait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-body >p")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".blockPage")));
		
		String text = driver.findElement(By.cssSelector(".modal-body >p")).getText();
		System.out.println(text);
	}
}