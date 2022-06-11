package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	//  how to make a test case pass or fail
	
	@Test
	public void test1() {
		Assert.assertTrue(true); // it will expect true value
		boolean condition = 1>0;
		Assert.assertTrue(condition, "Expecting true value but found false value.");
	}

	@Test
	public void test2() {
		Assert.assertFalse(false); // it will expect false value
		//boolean condition = 1<0;
		//Assert.assertTrue(condition);
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(1, 1); // pass
		Assert.assertNotEquals(1, 2); // fail
		Assert.assertEquals("selenium", "selenium1","Both the values are not matching...");
		System.out.println("just checking");
	}
}
