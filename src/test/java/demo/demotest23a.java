package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pract.library;

public class demotest23a {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/delete_customer.php");
//alert
WebElement cid=driver.findElement(By.xpath("//input[@name='cusid']"));
cid.sendKeys("123456789");
WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
submit.click();
Thread.sleep(3000);


//alert handle
Alert alt=driver.switchTo().alert();
System.out.println(alt.getText());
//click on cancel
//alt.dismiss();

alt.accept();

System.out.println(alt.getText());

Thread.sleep(2000);
alt.accept();
library.capturescreenshot(driver);
	}

}
