package test_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brouser_opening {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/sql/default.as");
driver.navigate().to("https://github.com/ganeshpatil1012/Demo1");//by using navigate method driver navigate to specific url on the same window
driver.navigate().back();
driver.navigate().forward();
driver.close();
	}

}
