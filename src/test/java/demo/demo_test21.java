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

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_test21 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");// open url
		WebElement emailid=driver.findElement(By.xpath("//input[@name=\"email\"]"));
	   
		Actions act=new Actions(driver);
		//shift + bugspotter + shift
		act.keyDown(emailid,Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();
		
		// ctrl + a
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//click
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).click();
		
		//ctrl v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		//driver.navigate().to("https://www.instagram.com/");
		//WebElement usr=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		//shift + value + shift
		//act.keyDown(usr,Keys.CONTROL).sendKeys("//input[@name=\"username\"]").keyUp(Keys.SHIFT).build().perform();
		
		
		
		//take screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        
File destn=new File("C:\\Users\\Jijau\\eclipse-workspace\\BS16\\screenshot\\facebook.png");
FileUtils.copyFile(src, destn);
	}

}
