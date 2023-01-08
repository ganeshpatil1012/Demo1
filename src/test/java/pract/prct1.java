package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prct1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");// open url

//name in console
String url=driver.getCurrentUrl();
String title=driver.getTitle();
System.out.println(url);
System.out.println(title);

// find element location -- username
WebElement login=driver.findElement(By.id("email"));
login.sendKeys("ganesh");
//pass
WebElement pass=driver.findElement(By.id("pass"));
pass.sendKeys("123456789");

WebElement submit=driver.findElement(By.xpath("//button[@name='login']"));
submit.click();
//text tagname
String textmsj=driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getTagName();
System.out.println(textmsj);

driver.close();
	}

}
