package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;
import pract.library;

public class demotest23 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement email=driver.findElement(By.xpath("//input[@name='email']"));

Actions act=new Actions(driver);
// shift + bugspotter + shift

act.keyDown(email,Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();

//ctrl + a
act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

//ctrl + c

act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

//click
driver.findElement(By.xpath("//input[@name='pass']")).click();

//ctrl + v
act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
library.captureScreenshot_element(email);

/*//screensht full webpage
String rm=RandomString.make(5); //abcde
TakesScreenshot ts= (TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File destn=new File("C:\\Users\\Jijau\\eclipse-workspace\\BS16\\screenshot\\"+rm+".png");
FileUtils.copyFile(src, destn);
//capture screenshot of element

WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
File src1=logo.getScreenshotAs(OutputType.FILE);
File destn1=new File("C:\\Users\\Jijau\\eclipse-workspace\\BS16\\screenshot\\logo.png");
FileUtils.copyFile(src1, destn1);
	*/}
	

}
