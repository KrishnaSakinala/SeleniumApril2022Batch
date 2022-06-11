package testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInSameClass {
	
	@Test(dataProvider = "dataProvider")
	public void verifyLogin(String userName, String password) {
		System.out.println(userName +"  -- "+ password);
	}
	
	@Test(dataProvider = "credentials", dataProviderClass = DataProviderClass.class)
	public void verifyLogin1(String userName, String password) {
		System.out.println(userName +"  -- "+ password);
	}

	@DataProvider
	public Object[][] dataProvider() {
		return new Object[][] {
			{"cun","cpwd"},
			{"cun","wpwd"},
			{"wun","cpwd"},
			{"wun","wpwd"}
		};
	}
}