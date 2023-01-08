package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class revision_all {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		///click radio button
/*		WebElement button=driver.findElement(By.xpath("//input[@name='radioButton']"));
		button.click();
		///select country
		WebElement type_country=driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
		type_country.sendKeys("india");
		
		///dropdown handle
		WebElement selec=driver.findElement(By.xpath("//select[@name=\"dropdown-class-example\"]"));
         //select.click();
         Select sel=new Select(selec);
         sel.selectByVisibleText("Option3");
 		//check checkbox
         WebElement checkbox=driver.findElement(By.xpath("//input[@name='checkBoxOption1']"));
		checkbox.click();		
		///window handeling
		String parentwindowid=driver.getWindowHandle();
		System.out.println("id for parent window  "  + parentwindowid);//parent id
		//driver.findElement(By.xpath("//button[@class='btn-style class1']")).click();
		//parent and child id
		Set<String> allid=driver.getWindowHandles();
		System.out.println("id for all window " + allid);
		List<String> list=new ArrayList(allid);
		//driver.switchTo().window(list.get(1));
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test@gmail.com");
		Thread.sleep(5000);
		//driver.close();//close parent window
		///switch tab
		//driver.findElement(By.xpath("//a[@class='btn-style class1 class2']")).click();
		//driver.findElement(By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/sign_up'])[1]")).click();
		/*driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get("https://www.rahulshettyacademy.com/");
		
		//alert handle
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("ganesh");
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		Alert alt=(Alert) driver.switchTo().alert();
		System.out.println(alt.getText());
		//Thread.sleep(3000);
		alt.dismiss();*/
		
		//mouse hover
		WebElement mouseh=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[5]"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(mouseh).build().perform();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		

	}

	
}
