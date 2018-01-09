package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {
	
	public static WebElement findelement(WebDriver driver, String xpath)
	{
	WebElement a = driver.findElement(By.xpath(xpath));
	
	return a;
			
	}
	
	public static void sleep(WebDriver driver, int sec) throws InterruptedException
	{
		Thread.sleep(sec*1000);
	}
	
	public static String readprop(WebDriver driver, String key) throws IOException {
		InputStream fs=new FileInputStream("src\\test\\java\\Util\\locator.properties");
		Properties pro=new Properties();
		pro.load(fs);
		
		String value= pro.getProperty(key);
		return value;
	}
	
	public static String readexcel(WebDriver driver, int row, int col) throws IOException {
		
		FileInputStream fs=new FileInputStream("C:\\Users\\Usman\\eclipse-workspace\\Maven2\\exdata.xlsx");
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sh= wb.getSheetAt(0);
		Row rw=sh.getRow(row);
		Cell ce=rw.getCell(col);
		String a=ce.getStringCellValue();
		
		return a;
		
	
	}

}
