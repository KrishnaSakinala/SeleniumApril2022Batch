package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationUsingXmlFile {
	
	@Test @Parameters({"browser"})
	public void testCase1(String param) {
		if(param.equalsIgnoreCase("chrome")) {
			System.out.println("Using chrome browser");
		}
		else {
			System.out.println("using firefox browser");
		}
		
	}
	
	@Test 
	@Parameters({"testlevelparam"})
	public void testCase2(String param) {
		System.out.println("Parameter value is: " + param);
	}

}
