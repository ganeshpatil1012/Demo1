package demoTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test3b {
	@BeforeMethod
	public void SetUp() {
		System.out.println("BrouserOpen");
		
	}
	@Test
	public void testa() {
		System.out.println("test A");
		Assert.assertTrue(false);
	}
	@Test(invocationCount=2)
	public void testb() {
		System.out.println("test B");
	}
	@Test(dependsOnMethods="testa")
	public void testc() {
		System.out.println("test C ");
	}
	@AfterMethod
	public void TestDown() {
		System.out.println("BrouserClose");
	}

}
