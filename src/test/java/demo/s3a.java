package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class s3a {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");

driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
Thread.sleep(3000);
List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b'][1]//li"));
Thread.sleep(3000);
System.out.println(list.size());
for (int i=0;i<=list.size();i++) {
	String AutoText=list.get(i).getText();
	System.out.println(AutoText);
	if(AutoText.endsWith("maven download")) {
		list.get(i).click();
		break;
		
		
	}
	
}

}



	

}
