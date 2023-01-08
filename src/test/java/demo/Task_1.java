package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();


ChromeDriver driver=new ChromeDriver();

driver.get("https://demo.guru99.com/test/newtours/register.php");
//driver.manage().window().maximize();

//WebElement FirstName=driver.findElement(By.xpath(null));
//FirstName.sendKeys("GANESH");

//WebElement FirstName=driver.findElement(By.name("firstName"));
//FirstName.sendKeys("GANESH");

WebElement lastname=driver.findElement(By.name("lastName"));
lastname.sendKeys("lokhande");

WebElement phone=driver.findElement(By.name("phone"));
phone.sendKeys("9511815513");

WebElement email=driver.findElement(By.id("userName"));
email.sendKeys("ganeshpatil1012@gmail.com");

WebElement address=driver.findElement(By.name("address1"));
address.sendKeys("at.jafrabad");

WebElement city=driver.findElement(By.name("city"));
city.sendKeys("jalna");

WebElement state=driver.findElement(By.name("state"));
state.sendKeys("maharashtra");

WebElement code=driver.findElement(By.name("postalCode"));
code.sendKeys("postalCode");

WebElement country=driver.findElement(By.name("country"));
country.sendKeys("india");

WebElement user=driver.findElement(By.id("email"));
user.sendKeys("ganeshpatil1012@gmail.com");

WebElement pass=driver.findElement(By.name("password"));
pass.sendKeys("pass@1234");

WebElement cnfp=driver.findElement(By.name("confirmPassword"));
cnfp.sendKeys("pass@1234");

WebElement submit=driver.findElement(By.name("submit"));
submit.click();

	}

}
