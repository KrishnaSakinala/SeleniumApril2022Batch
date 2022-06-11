package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // open chrome browser
				
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement destinationElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, destinationElement).build().perform();
		//action.clickAndHold(sourceElement).moveToElement(destinationElement).release().build().perform();
		//action.moveToElement(sourceElement).clickAndHold().moveToElement(destinationElement).release().perform();
				
	}

}
