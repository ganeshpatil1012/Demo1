package test_11;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class locators extends open_brouser{
	@Test

	public void find_elements() throws Exception {
		driver.findElement(By.id("email")).sendKeys("ganesh");
		driver.findElement(By.name("pass")).sendKeys("123456789");
		//Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@name='login']")).click();
		//Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		String wh=driver.getWindowHandle();
		System.out.println(wh);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//driver.get("https://meet.google.com/");
		Set<String>swh=driver.getWindowHandles();
		System.out.println(swh);

	}

}
