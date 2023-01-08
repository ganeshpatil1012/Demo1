package demoTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test3a {
	@BeforeMethod
	public void bm () {
		System.out.println("Brouser open");
		
	}
	@Test
	public void testA () {
		System.out.println("testA");
		//Assert.assertTrue(false);
	}
@Test (dependsOnMethods="testA")
public void testB() {
	System.out.println("testB");
}

@Test(dependsOnMethods="testB")
public void testC() {
	System.out.println("testC");
}
@org.testng.annotations.AfterMethod
public void AfterMethod(){
	System.out.println("Brouser close");
	
}
}
