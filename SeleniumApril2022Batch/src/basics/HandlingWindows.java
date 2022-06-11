package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser
				
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.cssSelector("[href='http://www.selenium.dev']")).click();
		
		
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iter = windowIds.iterator();
		
		String mainWindow = iter.next(); 
		String childWindow = iter.next();
		
		driver.switchTo().window(childWindow);
		
		Thread.sleep(5000);
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.switchTo().window(mainWindow);
		
		System.out.println("Title: " + driver.getTitle());
		
		//driver.quit(); // closes the entire browser
		driver.close();  // closes the focused window
				
	}

}
