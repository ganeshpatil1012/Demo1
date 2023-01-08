package demoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tesr_Before {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		}
	@Test(priority=1)
	public void testG() {
		System.out.println("G");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testG");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("testG");
	}
	@Test(priority=0)
	public void testv() {
		System.out.println("v");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testv");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("testv");
	}
	@Test(priority=-1)
	public void testz() {
		System.out.println("z");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testz");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("testz");
	}
	@Test(priority=-2,enabled=true)
	public void testh() {
		System.out.println("h");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testh");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("testh");
	}
	
	@AfterMethod
	public void close(){driver.close();
		}
	

}
