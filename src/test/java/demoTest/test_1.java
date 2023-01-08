 package demoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pract.library;

public class test_1 {
	@Test
	public void test1() throws Exception {
		String data1=library.getStringData_Excel("sheet2", 0, 0);
		System.out.println(data1);
	}
	@Test
	public void test_2() throws Exception {
		String data2=library.getStringData_Excel("sheet2", 1, 0);
		System.out.println(data2);
	}
	@Test
	public void test_3() throws Exception {
		String data3=library.getStringData_Excel("sheet2",2, 0);
		System.out.println(data3);
		
	}
	@Test 
	public void test4() throws Exception {
		String data4=library.getStringData_Excel("sheet2", 3, 0);
	System.out.println(data4);}
	@Test
	public void test5() throws Exception {
		String data5=library.getStringData_Excel("sheet2", 4, 0);
		System.out.println(data5);
	}
	@Test 
	public void test6() throws Exception {
		String data6=library.getStringData_Excel("sheet2", 5, 0);
		System.out.println(data6);
		
	}
	@Test 
	public void test7 () throws Exception {
		String data7=library.getStringData_Excel("sheet2", 6, 0);
		System.out.println(data7);
	}
	@Test
	public void test8() throws Exception {
		String data8=library.getStringData_Excel("sheet2", 7, 0);
		System.out.println(data8);
				}
	@Test
	public void test9() throws Exception {
		String data10=library.getStringData_Excel("sheet2", 8, 0);
		System.out.println(data10);
	}
	@Test
	public void test10() throws Exception {
		String data11=library.getStringData_Excel("sheet2", 9, 0);
		System.out.println(data11);
	}
	@Test
	public void test11() throws Exception {
		String data12=library.getStringData_Excel("sheet2", 10, 0);
		System.out.println(data12);
	}
	@Test
	public void test12() throws Exception {
		String data13=library.getStringData_Excel("sheet2", 11, 0);
		System.out.println(data13);
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	}
	
}
