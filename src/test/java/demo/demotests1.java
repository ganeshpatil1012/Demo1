package demo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demotests1 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
Thread.sleep(1000);
driver.manage().window().maximize();
Thread.sleep(1000);
Thread.sleep(2000);
driver.navigate().to("https://mvnrepository.com/");
//Thread.sleep(2000);
driver.navigate().back();
//Thread.sleep(2000);
driver.navigate().forward();
//Thread.sleep(2000);
driver.navigate().refresh();
//Thread.sleep(3000);
driver.close();

	}

}
