package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterDemo {
	
	// before each and every test method/test case
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Open browser");
	}
	
	// after each and every test method/test case
	@AfterMethod
	public void afterMethod() {
		System.out.println("close browser");
	}
	
	// before all test methods/test cases with in the class
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class...");
	}
	
	// after all test methods/test cases with in the class
	@AfterClass
	public void afterClass() {
		System.out.println("After Class...");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test...");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test...");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite...");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite...");
	}
	
	@Test
	public void loginPositiveScenario1() {
		System.out.println("Positive test 1");
	}
	
	@Test
	public void loginPositiveScenario2() {
		System.out.println("Positive test 2");
	}
	
	@Test
	public void loginNegativeScenario1() {
		System.out.println("Negative test 1");
	}
	
	@Test
	public void loginNegativeScenario2() {
		System.out.println("Negative test 2");
	}

}
