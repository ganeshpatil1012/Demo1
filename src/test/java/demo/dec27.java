package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dec27 {

	public static void main(String[] args) throws Exception {
//child window handle
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		
		// to get parent widow id
		String parentid=driver.getWindowHandle();//gives the address of parent window >> and the return type is string
		System.out.println("parent window id ==" + parentid);
		
		// click on link
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//parent and child id
		Set<String> allid=driver.getWindowHandles();// gives address of parent + child windw >>> and the return type is set of string
		System.out.println("all id parent and child ==" + allid);
		List<String> list=new ArrayList(allid);
		System.out.println(list.get(0));//parent id
		System.out.println(list.get(1));//child id
		
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("ganeshpatil@gmail.com");
		
		driver.switchTo().window(list.get(0));
		Thread.sleep(3000);
		driver.switchTo().window(list.get(1));

		driver.close(); // close current open window only
		Thread.sleep(2000);
		driver.quit();  // close current + all window
		
		
	}

}
