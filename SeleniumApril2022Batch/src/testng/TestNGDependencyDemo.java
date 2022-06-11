package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnMethods = "signUp")
	public void logIn() {
		System.out.println("Login");
	}
	
	@Test()
	public void signUp() {
		System.out.println("Sing Up");
		Assert.assertTrue(false);
	}
}