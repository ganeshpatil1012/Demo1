package test_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class open_brouser {
	
	public static WebDriver driver;
	@Parameters ("browser")
	@BeforeTest
	

	public void setup (String browser ) {
		if(browser.equalsIgnoreCase("chrome")){WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();}
		else if(browser.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		

	}
	@AfterMethod 
	void TesrDown() {
		driver.close();
		
	}

}
