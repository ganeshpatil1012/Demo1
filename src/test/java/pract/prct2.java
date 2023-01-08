package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prct2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//scroll by pixel
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-500)","");
		Thread.sleep(5000);

		//scroll by element
		WebElement element=driver.findElement(By.xpath("//li[text()='English (UK)']"));
        js.executeScript("arguments[0].scrollIntoView()", element);
		
	}

}
