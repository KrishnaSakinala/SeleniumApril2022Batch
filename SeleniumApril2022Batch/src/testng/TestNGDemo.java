package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test(enabled = false)
	public void testCase1() {
		System.out.println("This is test case1");
	}
	
	
	@Test 
	@Ignore 
	public void testCase2() {
		System.out.println("This is test case2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("This is test case3");
	}
	
	@Test
	public void testCase4() {
		System.out.println("This is test case4");
	}
	
	@Test
	public void testCase5() {
		System.out.println("This is test case5");
	}
}