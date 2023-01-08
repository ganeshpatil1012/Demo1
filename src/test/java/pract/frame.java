package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/Jijau/Documents/frame.html");

//driver.switchTo().frame(1);
WebElement selenium=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
driver.switchTo().frame(selenium);

driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
driver.switchTo().defaultContent();
driver.switchTo().frame(0);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeAsyncScript("window.scrollBy(0,500)", "");
driver.switchTo().defaultContent();

driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();
//Thread.sleep(2000);
//driver.navigate().back();

	}

}
