package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class task_3 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
//driver.manage().window().maximize();

//WebElement login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
//login.click();

WebElement fp=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
fp.click();
Thread.sleep(3000);
WebElement cancel=driver.findElement(By.xpath("//a[contains(text(),'Cancel')]"));
cancel.click();

WebElement signup=driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]"));
signup.click();
	}

}
