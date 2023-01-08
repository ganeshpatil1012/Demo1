package demoTest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class test3 {
	@BeforeMethod
	public void openBrouser() {
		System.out.println("brouser open");
	}
	@Test(priority=1 ,invocationCount=3)//invocationCount to execute test number of times
	public void test1() {
		System.out.println("test 1");
		
	}
	@Test
	public void test2() {
		System.out.println("test 2");
	
	}
	@Test(priority=2, invocationCount=2)
	public void test3() {
		System.out.println("test 3");
		
	}
 @AfterMethod
public void AfterTest() {
	System.out.println("brouserClose");
}
}
