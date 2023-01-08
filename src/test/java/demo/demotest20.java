package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demotest20 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");// open url
		//element--double click
		Actions act1=new Actions(driver);
		WebElement doubleclickele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//act1.doubleClick(doubleclickele).build().perform();
		
		//right click
		WebElement rightclickele=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement quit=driver.findElement(By.xpath("//span[text()='Quit']"));
		act1.contextClick(rightclickele).click(quit).build().perform();
	}

}
