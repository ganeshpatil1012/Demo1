import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class read_exceldata {

	public static void main(String[] args) throws Exception {
String path="C:\\Users\\Jijau\\eclipse-workspace\\BS16\\TestData\\datatest.xlsx";
FileInputStream fis=new FileInputStream(path);
XSSFWorkbook wb=new XSSFWorkbook(fis);

 String data0_0=wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
 System.out.println(data0_0);
 
 String data1_0= wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
 System.out.println(data1_0);
 
 Double data2_0=wb.getSheet("Sheet2").getRow(2).getCell(0).getNumericCellValue();
 //System.out.println(data2_0);//9.511815513E9
String data=String.valueOf(data2_0);
 System.out.println(data.replace("E9", "").replace(".", ""));
 
 String data3_0=wb.getSheet("Sheet2").getRow(3).getCell(0).getStringCellValue();
 System.out.println(data3_0);
 
 String data4_0=wb.getSheet("Sheet2").getRow(4).getCell(0).getStringCellValue();
 System.out.println(data4_0);
 
 String Data5_0=wb.getSheet("Sheet2").getRow(5).getCell(0).getStringCellValue();
 System.out.println(Data5_0);
 
 String Data6_0=wb.getSheet("Sheet2").getRow(6).getCell(0).getStringCellValue();
 System.out.println(Data6_0);
 
 Double data7_0=wb.getSheet("Sheet2").getRow(7).getCell(0).getNumericCellValue();
 //System.out.println(data7_0);//431206.0
String data1=String.valueOf(data7_0);
 System.out.println(data1.replace(".0", ""));
 
 String Data8_0=wb.getSheet("Sheet2").getRow(8).getCell(0).getStringCellValue();
 System.out.println(Data8_0);
 
 String Data9_0=wb.getSheet("Sheet2").getRow(9).getCell(0).getStringCellValue();
 System.out.println(Data9_0);
 
 String Data10_0=wb.getSheet("Sheet2").getRow(10).getCell(0).getStringCellValue();
 System.out.println(Data10_0);
 
 String Data11_0=wb.getSheet("Sheet2").getRow(11).getCell(0).getStringCellValue();
 System.out.println(Data11_0);
 
 WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demo.guru99.com/test/newtours/register.php");
 
 WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
 firstname.sendKeys(data0_0);
 WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
 last_name.sendKeys(data1_0);
 WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
 //phone.sendKeys(data);
 WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
 userName.sendKeys(data3_0);
WebElement  address1=driver.findElement(By.xpath("//input[@name='address1']"));
address1.sendKeys(data4_0);
WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
city.sendKeys(Data5_0);
WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
state.sendKeys(Data6_0);
WebElement PIN=driver.findElement(By.xpath("//input[@name='postalCode']"));
//PIN.sendKeys(data1);
WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
country.sendKeys(Data8_0);
WebElement userName1=driver.findElement(By.xpath("//input[@name='email']"));
userName1.sendKeys(Data9_0);
WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
pass.sendKeys(Data10_0);
WebElement Cnfp=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
Cnfp.sendKeys(Data11_0);



Thread.sleep(5000);
driver.quit();

 
 
 
 
 
 
 
 
 

		
	}

}
