package pract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class even1 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/delete_customer.php");
WebElement cid=driver.findElement(By.xpath("//input[@name='cusid']"));
cid.sendKeys("123456789");
WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
submit.click();
// alert handeling
 Alert alt=(Alert) driver.switchTo().alert();
 System.out.println(alt.getText());
 alt.accept();
 
 System.out.println(alt.getText());
 alt.accept();
 

 
 


	}

}
