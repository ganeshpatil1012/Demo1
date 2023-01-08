package crossBrowser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginTest extends baseClass {
	@Test
	public void verifyLogin() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ganesh");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	

}
