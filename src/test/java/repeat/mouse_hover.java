package repeat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pract.library;

public class mouse_hover {

	public static void main(String[] args) throws Exception {
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/drag_drop.html");
//mouse hover
//Actions ----Mouse Movement and keyboard actions
Actions act=new Actions(driver);
WebElement selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));
act.moveToElement(selenium).click().build().perform();

Alert alt=(Alert) driver.switchTo().alert();
System.out.println(alt.getText());
alt.dismiss();

//WebElement drag=driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
//WebElement drop=driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
//act.dragAndDrop(drag, drop);




	}

}
