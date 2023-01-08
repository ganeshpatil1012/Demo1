package pract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.RandomString;

public class library {
	public static void ScrollToElement(WebDriver driver,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView()", element);}
	
/*public static void ScrollToElement(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);*/
		
	
		
		public static void capturescreenshot(WebDriver driver) throws Exception {
			String RM=RandomString.make(3); //abc
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File destn=new File("C:\\Users\\Jijau\\eclipse-workspace\\BS16\\screenshot\\"+RM+".png");
			FileUtils.copyFile(src, destn);
			
		}
		
		public static void captureScreenshot_element(WebElement element) throws Exception {
			File src1=element.getScreenshotAs(OutputType.FILE);
			File destn1=new File("C:\\Users\\Jijau\\eclipse-workspace\\BS16\\screenshot\\logo.png");
			FileUtils.copyFile(src1, destn1);
			
		} 
		public static String getStringData_Excel (String sheetname,int row,int cell) throws Exception {
			String path="C:\\Users\\Jijau\\eclipse-workspace\\BS16\\TestData\\datatest.xlsx";
			FileInputStream file=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(file);
			return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		}
		
		
		
	

}
