package pract;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_excel {

	public static void main(String[] args) throws Exception {
		/*first of all you have go to maven repository and add jar files
		 * 1] apache poi common 
		 * 2]Apache POI API Based On OPC and OOXML Schemas
		 * step 2] then create folder testdata//click right //show in 
		 * //system explorer//click on folder and add excel file*/
		String path="C:\\Users\\Jijau\\eclipse-workspace\\BS16\\TestData\\datatest.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data0_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0_0);
		
	String data0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data0_1);

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	email.sendKeys(data0_0);
	
	WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	pass.sendKeys(data0_1);
	Thread.sleep(4000);
	//driver.close();
	
	
	
	
	}

}
