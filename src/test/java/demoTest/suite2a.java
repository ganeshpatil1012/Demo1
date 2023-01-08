package demoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class suite2a {
	ChromeDriver driver;
	@BeforeMethod
	public void bm() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
	}
	@Test 
	public void test1 () 
	{
		WebElement option=driver.findElement(By.id("vfb-7-2"));
		option.click();
		System.out.println("option 2 selected");
		}
	@Test(groups= {"regression"})
	public void Test2() {
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		option1.click();
		System.out.println("option 1 is selected");
	}
	@Test
	public void Test3() {
		WebElement checkbox=driver.findElement(By.id("vfb-6-0"));
		checkbox.click();
		System.out.println("checkbox is selected");
		}
	
@AfterMethod
public void Am() throws Exception {System.out.println("am");
Thread.sleep(3000);
driver.close();}

}
