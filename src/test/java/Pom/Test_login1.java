package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_login1 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void test_1() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.getTxt_email().sendKeys("text");
		login.getTxt_pass().sendKeys("1234");
		login.getButton_login().click();}
	
	@Test 
	public void verify_Login_Valid() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.getTxt_email().sendKeys("test_2");
		login.getTxt_pass().sendKeys("123456");
		login.getButton_login().click();
	}
	@AfterMethod
	public void TearDown() {
		driver.close();
	}

}
