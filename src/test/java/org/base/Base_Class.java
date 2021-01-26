package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.NeedsLocalLogs;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class{

	public static WebDriver driver;

	public static Actions a;

		public static void chromeBrowser(String url) {

			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			driver.get(url);
			
		}
		
		public static void firefoxBrowser() {

			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
		}
		
		public static void edgeBrowser() {

			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
			
		}
		
		public static void pageUrl(String url) {

			driver.get(url);
		}
		
		public static void maximize() {

			driver.manage().window().maximize();
		}
		
		public static void implictWait() {

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		
		public static void explictWait(WebElement element) {

			WebDriverWait w = new WebDriverWait(driver, 15);
			w.until(ExpectedConditions.elementToBeSelected(element));
		}
		
		public static void sendKeys(WebElement element, String value) {

			element.sendKeys(value);
			
		}
		
		public static void clickButton(WebElement element) {

			element.click();
		}
		
		public static void quitBrowser() {
			
			driver.quit();
			
		}
		
		public static void mousehOver(WebElement element) {
			a = new Actions(driver);
			a.moveToElement(element).perform();
		}
		
		public static void mousehClick(WebElement element) {
			a = new Actions(driver);
			a.doubleClick(element).perform();
		}
		
		
		public static void title() {

			String title = driver.getTitle();
			System.out.println(title);
		}
		
		public static String getAttribute(WebElement element) {
			
			String attribute = element.getAttribute("value");
			
			return attribute;
			
		}
		
		public static void getText(WebElement element) {

			String text = element.getText();
			System.out.println(text);
		}
		
		public static void scrollDown(WebElement element) {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			
		}
		
		public static void javaScriptClick(WebElement element) {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
			
		}
		
		public static void javaScriptValue(WebElement element, String name) {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value',' " + name + " ')", element);
			
		}
		
		
		public static void dropDown(WebElement element, String value) {

			Select s = new Select(element);
			s.selectByValue(value);
		}
	
		public static void dropdown1(WebElement element, String value) {
			
			Select s = new Select(element);
			s.selectByVisibleText(value);
			
		}
		
		
		
		public static String excelCodeAdactinHotel(int row, int cell) throws Exception {

			File f = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Adactin_Hotel.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook w = new XSSFWorkbook(fis);	
			XSSFSheet sheet = w.getSheetAt(0);
			XSSFRow rows = sheet.getRow(row);
			XSSFCell cells = rows.getCell(cell);
			int cellType = cells.getCellType();
			
			String value = " ";
			
			if (cellType == 1) {
				
				value = cells.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(cells)) {
				
				Date date = cells.getDateCellValue();
				
				SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy");
				
				value = s.format(date);
				
			}
			
			else {
				
				
				double dd = cells.getNumericCellValue();
				long l = (long)dd;
				value = String.valueOf(l);
				
			}
			
			return value;
		}
		
		
		public static String excelCode(int row, int cell) throws Exception {

			File f = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Excel_DataDriven.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook w = new XSSFWorkbook(fis);	
			XSSFSheet sheet = w.getSheetAt(0);
			XSSFRow rows = sheet.getRow(row);
			XSSFCell cells = rows.getCell(cell);
			int cellType = cells.getCellType();
			
			String value = " ";
			
			if (cellType == 1) {
				
				value = cells.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(cells)) {
				
				Date date = cells.getDateCellValue();
				
				SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy");
				
				value = s.format(date);
				
			}
			
			else {
				
				
				double dd = cells.getNumericCellValue();
				long l = (long)dd;
				value = String.valueOf(l);
				
			}
			
			return value;
		}
		
		public static void excelWrite(int row, int cell, String value) throws Exception {

			File f = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Excel_DataDriven.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(fis);
			
			Sheet cSheet = w.getSheet("Sheet1");
			
//			Sheet createSheet = w.createSheet();
			
			Row row1 = cSheet.createRow(row);
			
			Cell cell1 = row1.createCell(cell);
			
			cell1.setCellValue(value);
			
			FileOutputStream fos =new FileOutputStream(f);
			
			w.write(fos);
			
			
			
			
		}
		
		public static void excelWriteAdactinHotel(int row, int cell, String value) throws Exception {

			File f = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Adactin_Hotel.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(fis);
			
			Sheet cSheet = w.getSheet("Sheet1");
			
			Row row1 = cSheet.getRow(row);
			
			Cell cell1 = row1.createCell(cell);
			
			cell1.setCellValue(value);
			
			FileOutputStream fos =new FileOutputStream(f);
			
			w.write(fos);
			
			
			
			
		}

		
		
		public static void excelWrite2(int row, int cell, String value) throws Exception {

			File f = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Excel_DataDriven.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(fis);
			
			Sheet cSheet = w.getSheet("Sheet1");
			
			Row row1 = cSheet.getRow(row);
			
			Cell cell1 = row1.createCell(cell);
			
			cell1.setCellValue(value);
			
			FileOutputStream fos =new FileOutputStream(f);
			
			w.write(fos);
			
			
			
			
		}

		
		
		
		public static void excelWrite1(int row,  int cell, String value) throws Exception {

			File f = new File("C:\\Users\\Ram\\eclipse-workspace\\Data_Driven\\src\\test\\java\\org\\baseclassforexcel\\Base_Class.java");
			
			FileInputStream fis = new  FileInputStream(f);
			
			XSSFWorkbook w = new  XSSFWorkbook(fis);
			
			XSSFSheet sheet = w.getSheet("Sheet1");
			
			sheet.createRow(row).createCell(cell).setCellValue(value);
			
			FileOutputStream fos =  new FileOutputStream(f);
			
			w.write(fos);
			
		
			
		}
		
		public static void explicitWait(String value) {
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
			
		}
		
		public static void robotClass() throws AWTException {

			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
		public static void robotClass1() throws AWTException {

			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
		public static void robotClass2() throws AWTException {

			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
