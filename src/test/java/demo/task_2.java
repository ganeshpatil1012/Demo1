package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task_2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();

driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();

WebElement name=driver.findElement(By.xpath("//input[@name='firstName']"));
name.sendKeys("ganesh");

WebElement last=driver.findElement(By.xpath("(//input[@size=20])[2]"));
last.sendKeys("patil");

WebElement phone=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
phone.sendKeys("95111212123");

WebElement mail=driver.findElement(By.xpath("//input[@name='userName']"));
mail.sendKeys("ganeshpatil1012@gmail.com");

WebElement add=driver.findElement(By.xpath("//input[@name='address1']"));
add.sendKeys("jafrabad");

WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
city.sendKeys("jalna");

WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
state.sendKeys("maharashtra");

WebElement post=driver.findElement(By.xpath("//input[@name='postalCode']"));
post.sendKeys("431206");

WebElement country=driver.findElement(By.name("country"));
country.sendKeys("india");

WebElement user=driver.findElement(By.xpath("//input[@name='email']"));
user.sendKeys("ganeshpatil1012@gmail.com");

WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
pass.sendKeys("password");

WebElement cnfm=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
cnfm.sendKeys("password");

//WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
//submit.click();

//driver.close();




//WebElement name=driver.findElement(By.xpath("//input[@name='']"));
//name.sendKeys("");
	}

}
