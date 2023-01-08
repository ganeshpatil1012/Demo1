package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoTest_s2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//driver.close();
//anything on webpage ----web element -----txt,field,button,link,image
// locators--->to identify the webElement----->8 types
// Id,Name,ClassName,Tagname,link text, partial link text , css, Xpath
// identify web element
WebElement email=driver.findElement(By.id("email"));
email.sendKeys("test@gmail.com");

WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("12356456");

WebElement loginbtn=driver.findElement(By.name("login"));
loginbtn.click();

WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
System.out.println(forgot.getText());

//WebElement text=driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/a"));
//System.out.println(text.getText());

	}

}
