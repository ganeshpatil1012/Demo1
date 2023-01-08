package demoTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test4 {
	@BeforeTest
	public void beforeTest() {
		System.out.println("open brouser");
	}
	@Test(groups={"sanity"})
	public void test1(){
		System.out.println("test 1");
	}
	@Test(groups={"regression"})
	public void test2(){
		System.out.println("test 2");
	}
	@Test(groups={"sanity"})
	public void test3(){
		System.out.println("test 3");
	}
	@Test(groups={"sanity"})
	public void test4(){
		System.out.println("test 4");
	}
	@Test(groups={"regression"})
	public void test5(){
		System.out.println("test 5");
	}
	@Test(groups={"regression"})
	public void test6(){
		System.out.println("test 6");
	}
	
}
