package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver(); // open edge browser
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}

}
