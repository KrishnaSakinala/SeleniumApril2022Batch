package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGOrderDemo {
	
	
	@Test
	public void abc() {
		System.out.println("This is test case1");
	}
	
	@Test
	public void ABC() {
		System.out.println("This is test case4");
	}
	
	
	@Test 
	public void _pqr() {
		System.out.println("This is test case2");
	}
	
	@Test
	public void ab123() {
		System.out.println("This is test case3");
	}
	
	@Test
	public void $testCase5() {
		System.out.println("This is test case5");
	}
}