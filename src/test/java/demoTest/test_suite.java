package demoTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_suite {
	@BeforeSuite
	public void BS () {
		System.out.println("BeforeSuite");
	}
	@BeforeClass
	public void bc() {
		System.out.println("BeforeClass");}
	@BeforeTest
	public void BT() {
		System.out.println("BeforeTest");
	}
	@BeforeMethod
	public void BM(){
		System.out.println("BeforeMethod");}
	@Test
	public void test1() {System.out.println("test 1");}
	@Test
	public void test2() {System.out.println("test 2");}
	@Test
	public void test3() {System.out.println("test 3");}
	@AfterMethod
	public void AM() {System.out.println("afterMethod Browser Close");}
	@AfterTest
	public void AT() {
		System.out.println("AfterTest");
	}
	@AfterClass
	public void AC() {
		System.out.println("AfterClass");
	}
	@AfterSuite
	public void AS() {
		System.out.println("AfterSuite");
	}
	

}
