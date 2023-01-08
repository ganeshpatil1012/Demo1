package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_test_s3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b'][1]//li"));
		Thread.sleep(3000);//if time is given then only print the list or size is 0
		System.out.println(list.size()); //10
		
		for(int i=0;i<list.size();i++) { 
			String AutoText=list.get(i).getText();
			System.out.println(AutoText);
			
			if(AutoText.equals("maven download")){
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();
}

}
