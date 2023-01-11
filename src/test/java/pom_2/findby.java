package pom_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findby extends drop{
	public static void main (String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//dropDown handle --> tagname--select 
		
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		HandleDropDown_text(drp_country,"INDIA");
		Thread.sleep(3000);
		Select select=new Select(drp_country);
		select.selectByIndex(1);
		
               List<WebElement> list=select.getOptions();
		
		System.out.println(list.size()); // 264
		
		for(int i=0;i<=list.size();i++) {
			
			String drpOption=list.get(i).getText();
			System.out.println(drpOption);
			
			if(drpOption.equals("INDIA")) {
				list.get(i).click();
				break;
			}
	}
	


}}
