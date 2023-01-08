package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dec27 {

	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("file:///C:/Users/Jijau/frame.html");
		   driver.manage().window().maximize();
		   
		   // iframe switch
		   
		   driver.switchTo().frame(1); // index pass ifarme
		   
		   // switch to iframe using name /Id
		  // driver.switchTo().frame("Selenium");
		   
		   
		   WebElement seleniumFrame=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
		   
		   // WebElement frame switch
		   driver.switchTo().frame(seleniumFrame);
		   
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		   
		   //main page 
		   driver.switchTo().defaultContent(); // frame ---> mainpage
		   
		   driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook '] ")).click();
		   
		   driver.navigate().back();
		   
		   //switch iframe
		   driver.switchTo().frame(0);
		   
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,600)", "");
		   
		   
		   // mainpage ---> 2 --> 1-mainpage->2
		   driver.switchTo().defaultContent();
		   
		   driver.switchTo().frame(1);
		   driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
	}

}
