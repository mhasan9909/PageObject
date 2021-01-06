package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {
	
	public static String prtPageTitle(WebDriver driver) {
		String gtiTitle=driver.getTitle();
		return gtiTitle;
	}
	
	public static WebElement findEle(WebDriver driver, String xpath) {
		WebElement elem=driver.findElement(By.xpath(xpath));
		return elem;
	}
	
	public static String redProp(String key) throws IOException {
		File fl=new File("/Users/mdhasan/eclipse-workspace/POM_Project/locator.properties");
		FileInputStream fis=new FileInputStream(fl);
		Properties prop=new Properties();
		prop.load(fis);
		String locTor=prop.getProperty(key);
		return locTor;
		
	}
	
	public static void takeScShots(WebDriver driver, String name) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/mdhasan/eclipse-workspace/POM_Project/Ebay_TC001/"+name+".png"));
	}
	
	
	public static String readExcel(WebDriver driver, int rownum, int column) throws IOException {

	File fl = new File("/Users/mdhasan/eclipse-workspace/Selnium_17/priceline.xlsx");
	FileInputStream fls = new FileInputStream(fl);
	XSSFWorkbook wb = new XSSFWorkbook(fls);
	XSSFSheet sh = wb.getSheetAt(0);
	XSSFRow rw = sh.getRow(rownum);
	XSSFCell cel = rw.getCell(column);
	String value = cel.getStringCellValue();
	wb.close();
	return value;
	
	
}

	
}
