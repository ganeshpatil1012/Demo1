package pract;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_excel2 {

	public static void main(String[] args) throws Exception {
String path="C:\\Users\\Jijau\\eclipse-workspace\\BS16\\TestData\\datatest.xlsx";
FileInputStream file=new  FileInputStream(path);
XSSFWorkbook wb=new XSSFWorkbook(file);
String data0_0=wb.getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
System.out.println(data0_0);

String data1_0=wb.getSheet("sheet2").getRow(1).getCell(0).getStringCellValue();
System.out.println(data1_0);

double data=wb.getSheet("sheet2").getRow(2).getCell(0).getNumericCellValue();//9.511815513E9
//String data2_0=wb.getSheet("sheet2").getRow(2).getCell(0).getStringCellValue();
//System.out.println(data);
String data1=String.valueOf(data);
System.out.println(data1.replace(".","").replace("E9", ""));

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

//webelement user=
WebElement user=driver.findElement(By.xpath("//input[@name='email']"));
user.sendKeys(data1);

JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,500)", "");
Thread.sleep(3000);
WebElement img=driver.findElement(By.xpath("(//img)[1]"));
js.executeScript("arguments[0].scrollIntoView()",user );

	 }

}
