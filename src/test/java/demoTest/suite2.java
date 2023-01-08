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

public class suite2 {
	@BeforeSuite
	public void Bs() {System.out.println("bs");}
	@BeforeClass
	public void bc() {System.out.println("before class");}
	@BeforeTest
	public void bt() {System.out.println("before test");}
	@BeforeMethod
	public void bm() {System.out.println("before method");}
	@Test
	public void test1() {System.out.println("test 1");}
	@Test
	public void test2() {System.out.println("test2");}
	@Test
	public void test3() {System.out.println("test3");}
	
	@AfterMethod
	public void Am() {System.out.println("after method");}
	@AfterTest
	public void at() {System.out.println("after test");}
	@AfterClass
	public void ac() {System.out.println("after class");}
	@AfterSuite
	public void as() {System.out.println("after suite");
		}
}
