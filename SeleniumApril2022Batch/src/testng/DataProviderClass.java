package testng;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "credentials")
	public Object[][] dataProvider() {
		return new Object[][] {
			{"cun1","cpwd1"},
			{"cun1","wpwd1"},
			{"wun1","cpwd1"},
			{"wun1","wpwd1"}
		};
	}

}
