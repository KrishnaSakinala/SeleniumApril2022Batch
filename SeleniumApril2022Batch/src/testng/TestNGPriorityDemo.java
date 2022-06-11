package testng;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority = 2)
	public void testCase1() {
		System.out.println("This is test case1");
	}
	

	@Test(description = "This is a test case 2 in this test class.") 
	public void testCase2() {
		System.out.println("This is test case2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("This is test case3");
	}
	
	@Test(priority = 1)
	public void testCase4() {
		System.out.println("This is test case4");
	}
		
	@Test
	public void testCase5() {
		System.out.println("This is test case5");
	}

}
