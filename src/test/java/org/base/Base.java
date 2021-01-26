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
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.jsoup.helper.DataUtil;import org.omg.CORBA.ORBPackage.InvalidName;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static WebDriverWait webdriverWait;

	public static Alert a;

	public static Actions act;

	public static JavascriptExecutor js;

	public static Robot r;

	public static Select s;
	
	public static WebElement element;

// ================================================================= WEB DRIVERS ==============================================================================

	// 1 . CHROME DRIVER
	public static void chrome() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	// 2 . FIREFOX DRIVER
	public static void firefox() {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

	}

	// 3 . INTERNET EXPLORER DRIVER
	public static void ie() {

		WebDriverManager.iedriver().setup();

		driver = new InternetExplorerDriver();

	}
	
	// 3 . INTERNET EXPLORER DRIVER
	public static void edge() {

		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();

	}

// ================================================================== LAUNCH URL ================================================================================

	// 4 . LAUNCH URL
	public static void launchUrl(String url) {

		driver.get(url);

	}

// ================================================================== GET TITLE ================================================================================

	// 5 . GET TITLE
	public static String pageTitle() {

		String title = driver.getTitle();
		return title;

	}

/* ================================================================== GET CURRENT URL ================================================================================ */

	// 6 . GET CURRENT URL
	public static String currUrl() {

		String curUrl = driver.getCurrentUrl();
		return curUrl;

	}

// ================================================================== MAXIMIZE WINDOW ================================================================================

	// 7 . MAXIMIZE WINDOW
	public static void maxWindow() {

		driver.manage().window().maximize();

	}
	
/* ======================================================= FIND ELEMENT AND CLICK ========================================================================= */
	
	public static void clickBtnUsingId(String path) {
		
		element = driver.findElement(By.id(path));
		element.click();

	}
	
	public static void clickBtnUsingName(String path) {

		element = driver.findElement(By.id(path));
		element.click();

	}
	
	public static void clickBtnUsingClassName(String path) {

		element = driver.findElement(By.id(path));
		element.click();

	}

	public static void clickBtnUsingpath(String path) {

		element = driver.findElement(By.id(path));
		element.click();

	}
	
/* ====================================================== FIND ELEMENT AND SEND KEYS ========================================================== */
	
	public static void findAndSendUsingId(String path, String toSendValue) {

		element = driver.findElement(By.id(path));
		element.sendKeys(toSendValue);

	}
	
	public static void findAndSendUsingXpath(String xpathName, String toSendValue) {

		element = driver.findElement(By.xpath(xpathName));
		element.sendKeys(toSendValue);

	}
	
	public static void findAndSendUsingName(String path, String toSendValue) {

		element = driver.findElement(By.name(path));
		element.sendKeys(toSendValue);

	}
	
	public static void findAndSendUsingClassName(String path, String toSendValue) {

		element = driver.findElement(By.className(path));
		element.sendKeys(toSendValue);

	}

// ================================================================== IMPLICIT WAIT ================================================================================

	// 8 . IMPLICIT WAIT
	public static void implicitTime() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

// =================================================================== SEND KEYS ================================================================================

	// 9 . FIND ELEMENT AND SEND KEYS
	public static void findEle(WebElement element, String sendText) {

		element.sendKeys(sendText);

	}

// ======================================================================= CLICK ================================================================================

	// 10 . FIND ELEMENT AND CLICK IT
	public static void clickAny(WebElement element) {

		element.click();

	}
	
	// 10 . FIND ELEMENT AND CLICK IT
	public static void clear(WebElement element) {

		element.clear();

	}

// =================================================================== GET ATTRIBUT ================================================================================

	
	public static String getAttr(WebElement element) {
		
		String txt = element.getAttribute("value");
		return txt;

	}
	// 11 . GET ATTRIBUTE
	public static String getAttributeUsingId(String path) {
		
		element = driver.findElement(By.id(path));
		String attr = element.getAttribute("value");
		return attr;

	}
	
	public static String getAttributeUsingName(String path) {

		element = driver.findElement(By.name(path));
		String attr = element.getAttribute("value");
		return attr;

	}
	
	public static String getAttributeUsingClassName(String path) {

		element = driver.findElement(By.className(path));
		String attr = element.getAttribute("value");
		return attr;

	}

	public static String getAttributeUsingXpath(String path) {

		element = driver.findElement(By.xpath(path));
		String attr = element.getAttribute("value");
		return attr;

	}

// ===================================================================== GET TEXT ================================================================================

	// 12 . GET TEXT
	public static String textGet(WebElement element) {

		String txt = element.getText();

		return txt;

	}

// ========================================================================= CLOSE ================================================================================

	// 13 . CLOSE CURRENT PAGE
	public static void closeCurrentPage() {

		driver.close();

	}

// ========================================================================== QUIT ====================================================================================

	// 14 . CLOSE THE ENTIRE BROWSER
	public static void closeBrowser() {

		driver.quit();

	}

// ================================================================== WEB DRIVER WAIT ============================================================================================

	// 15 . ALERT IS PRESENT
	public static void acceptAlert() {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.alertIsPresent());

	}

	// 16 . ELEMENT TO BE CLICKABLE
	public static void elementClickableUsingId(String id) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.elementToBeClickable(By.id(id)));

	}

	// 16 . ELEMENT TO BE CLICKABLE USING NAME
	public static void elementClickableUsingName(String name) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.elementToBeClickable(By.name(name)));

	}

	// 16 . ELEMENT TO BE CLICKABLE USING CLASS NAME
	public static void elementClickableUsingClassName(String className) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.elementToBeClickable(By.className(className)));

	}

	// 16 . ELEMENT TO BE CLICKABLE USING XPATH
	public static void elementClickableUsingXpath(String xpath) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

	}

	// 17 . ELEMENT TO BE SELECTED USING ID
	public static void elementSelectedUsingId(String id) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.elementToBeSelected(By.id(id)));

	}

	// 17 . ELEMENT TO BE SELECTED USING NAME
	public static void elementSelectedUsingName(String name) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.elementToBeSelected(By.name(name)));

	}

	// 17 . ELEMENT TO BE SELECTED USING XPATH
	public static void elementSelectedUsingXpath(String xpath) {

		WebDriverWait okAlert = new WebDriverWait(driver, 5);
		okAlert.until(ExpectedConditions.elementToBeSelected(By.xpath(xpath)));

	}

	// 17 . ELEMENT TO BE SELECTED USING CLASS NAME
	public static void elementSelectedUsingClassName(String className) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.elementToBeSelected(By.className(className)));

	}

	// 17 . visibility Of Using Id
	public static void visibilityOfUsingId(String id) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(id))));

	}

	public static void visibilityOfUsingName(String name) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(name))));

	}

	public static void visibilityOfUsingXpath(String xpath) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);

		okAlert.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));

	}

	public static void visibilityOfUsingClassName(String className) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(className))));

	}

	// 20 . visibilityOfAllElementsLocatedByUsingId
	public static void visibilityOfAllElementsLocatedByUsingId(String id) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(id)));

	}

	// 21 . visibilityOfAllElementsLocatedByUsingXpath
	public static void visibilityOfAllElementsLocatedByUsingXpath(String xpath) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));

	}

	// 22 . visibilityOfAllElementsLocatedByUsingName
	public static void visibilityOfAllElementsLocatedByUsingName(String name) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(name)));

	}

	// 23 . visibilityOfAllElementsLocatedByUsingClassName
	public static void visibilityOfAllElementsLocatedByUsingClassName(String className) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(className)));

	}

	// 24 . visibilityOfElementLocatedUsingId
	public static void visibilityOfElementLocatedUsingId(String id) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));

	}

	// 25 . visibilityOfElementLocatedByUsingXpath
	public static void visibilityOfElementLocatedUsingXpath(String xpath) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

	}

	// 26 . visibilityOfElementLocatedUsingName
	public static void visibilityOfElementLocatedUsingName(String name) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));

	}

	// 27 . visibilityOfElementLocatedUsingClassName
	public static void visibilityOfElementLocatedUsingClassName(String className) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));

	}

	// 28 . FrameToBeAvailabelAndSwitchToUsingId
	public static void frameAvailableAndSwitchUsingId(String id) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(id)));

	}

	// 29 . FrameToBeAvailabelAndSwitchToUsingXpath
	public static void frameAvailableAndSwitchUsingXpath(String xpath) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpath)));

	}

	// 30 . FrameToBeAvailabelAndSwitchToUsingName
	public static void frameAvailableAndSwitchUsingName(String name) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(name)));

	}

	// 31 . FrameToBeAvailabelAndSwitchToUsingClassName
	public static void frameAvailableAndSwitchUsingClassName(String className) {

		WebDriverWait okAlert = new WebDriverWait(driver, 10);
		okAlert.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(className)));

	}

// ================================================================== FLUENT WAIT ====================================================================================

	// 32 . FLUENT WAIT ALERT
	public static void flueWaitAlert() {

		FluentWait<WebDriver> fluWait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		fluWait.until(ExpectedConditions.alertIsPresent());

	}

	// 32 . FLUENT WAIT ALERT USING ID
	public static void flueWaitElementToBeClickableUsingId(String id) {

		FluentWait<WebDriver> fluWait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		fluWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));

	}

	// 32 . FLUENT WAIT ALERT USING NAME
	public static void flueWaitElementToBeClickableUsingName(String name) {

		FluentWait<WebDriver> fluWait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		fluWait.until(ExpectedConditions.elementToBeClickable(By.name(name)));

	}

	// 32 . FLUENT WAIT ALERT USING XPATH
	public static void flueWaitElementToBeClickableUsingXpath(String xp) {

		FluentWait<WebDriver> fluWait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		fluWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xp)));

	}

	// 32 . FLUENT WAIT ALERT USING XPATH
	public static void flueWaitElementToBeClickableUsingClassName(String className) {

		FluentWait<WebDriver> fluWait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(Throwable.class);
		fluWait.until(ExpectedConditions.elementToBeClickable(By.className(className)));

	}

// ===================================================================== ALERT ===================================================================================

	public static String alertGetText() {
		a = driver.switchTo().alert();
		String text = a.getText();
		return text;

	}

	// 33 . ACCEPT ALERT
	public static void alertAccept() {

		a = driver.switchTo().alert();
		a.accept();

	}

	// 34 . DISMISS ALERT
	public static void alertDismiss() {

		a = driver.switchTo().alert();
		a.dismiss();

	}

	public static void alertSendKey(String sendTxt) {

		a = driver.switchTo().alert();
		a.sendKeys(sendTxt);

	}

	// 35 . SEND KEYS IN ALERT
	public static void alertSendKeysWithDismiss(String sendTxt) {

		a = driver.switchTo().alert();
		a.sendKeys(sendTxt);
		a.dismiss();

	}

	public static void alertSendKeysWithAccept(String sendTxt) {

		a = driver.switchTo().alert();
		a.sendKeys(sendTxt);
		a.accept();

	}

// ===================================================================== ACTIONS ===================================================================================

	// 36 . MOVE TO ELEMENT
	public static void moveElement(WebElement element) {

		act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	// 37 . DRAG AND DROP
	public static void dragDrop(WebElement source, WebElement destination) {

		act = new Actions(driver);
		act.dragAndDrop(source, destination).perform();

	}

	// 38 . DOUBLE CLICK
	public static void mouseDoubleClick(WebElement element) {

		act = new Actions(driver);
		act.doubleClick(element).perform();

	}

	// 38 . CONTEXT CLICK
	public static void mouseRightClick(WebElement element) {

		act = new Actions(driver);
		act.contextClick(element).perform();

	}

	// 39 . SEND KEYS
	public static void sctionSendKeys(WebElement element, String sendTxt) {

		act = new Actions(driver);
		act.sendKeys(element, sendTxt).perform();

	}

	// 40 . KEY DOWN AND KEY UP
	public static void keyDownShift(WebElement element) {

		act = new Actions(driver);
		act.keyDown(element, Keys.SHIFT).perform();

	}

	public static void keyUpShift(WebElement element) {

		act = new Actions(driver);
		act.keyUp(element, Keys.SHIFT).perform();

	}

// ===================================================================== JAVA SCRIPT EXECUTOR ===================================================================================

	// 41 . JAVA SCRIPT SEND KEYS
	public static void javaSendKeys(WebElement element, String sendTxt) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value' , '" + sendTxt + "')", element);

	}

	// 42 . JAVA SCRIPT CLICK
	public static void javaClick(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	// 43 . JAVA SCRIPT CLICK
	public static Object javaGetAttribute(WebElement element) {

		js = (JavascriptExecutor) driver;
		Object ans = js.executeScript("return arguments[0].getAttribute('value')", element);
		return ans;

	}

	// 44 . JAVA SCRIPT CLICK
	public static void scrollUpAndDown(WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

	}

// =========================================================== TAKE SCREEN SHOT =================================================================================

	// 45 . TAKE SCREEN SHOT AND STORE
	public static void takeScreenshot(String imgName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\Selenium Practical\\PracticeWithMaven\\ScreenShots\\" + imgName);
		FileUtils.copyFile(source, des);

	}

// =========================================================== IS DISPLAY =================================================================================

	// 46 . IS DISPLAY
	public static boolean isDisplay(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;
		
	}

// ======================================================= IS ENABLE ==================================================================

	// 47 . IS ENABLE
	public static boolean isClick(WebElement element) {

		boolean enabled = element.isEnabled();
		return enabled;

	}

// ======================================================= IS SELECTED ==================================================================

	// 48 . IS SELECTED
	public static boolean isSelect(WebElement element) {

		boolean selected = element.isSelected();
		return selected;

	}
	
// ======================================================= SWITCH TO FRAME ==================================================================

	// 49 . MOVE TO INNER FRAME TO OUTER FRAME
	public static void innerToOuterFrame() {

		driver.switchTo().defaultContent();

	}

	// SWITCH TO FRAME USING STRING
	public static void switchToFrameUsingString(String idOrName) {

		driver.switchTo().frame(idOrName);

	}

	// SWITCH TO FRAME USING STRING
	public static void switchToFrameUsingElement(WebElement element) {

		driver.switchTo().frame(element);

	}

	// SWITCH TO FRAME USING INDEX
	public static void switchToFrameUsingIndex(int num) {

		driver.switchTo().frame(num);

	}

// =========================================================== READ PARTICULAR DATA FROM EXCEL =========================================================
	
	public static String readExcel(int particularRow, int particularCellFromRow) throws IOException {

		File f = new File("E:\\Selenium Practical\\TestNg\\Excel\\Question5.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		Row row = sheet.getRow(particularRow);

		Cell cell = row.getCell(particularCellFromRow);
		
		int cellType = cell.getCellType();

		String value = " ";

		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			value = sdf.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;
	}

/* ======================================================= SELECT =============================================================== */	
	
	// SELECT BY INDEX
	public static void selectByIndexUsingId(WebElement element, int giveIndex) {
		
		s = new Select(element);
		s.selectByIndex(giveIndex);

	}
	
	public static void selectByIndexUsingName(WebElement element, int giveIndex) {

		s = new Select(element);
		s.selectByIndex(giveIndex);

	}
	
	public static void selectByIndexUsingClassName(WebElement element, int giveIndex) {

		s = new Select(element);
		s.selectByIndex(giveIndex);

	}

	public static void selectByIndexUsingXpath(WebElement element, int giveIndex) {

		s = new Select(element);
		s.selectByIndex(giveIndex);

	}
	
	public static void selectByStringUsingId(WebElement element, String value) {

		s = new Select(element);
		s.selectByValue(value);

	}
	
	public static void selectByStringUsingName(WebElement element, String value) {

		s = new Select(element);
		s.selectByValue(value);

	}
	
	public static void selectByStringUsingClassName(WebElement element, String value) {

		s = new Select(element);
		s.selectByValue(value);

	}
	
	public static void selectByStringUsingXpath(WebElement element, String value) {

		s = new Select(element);
		s.selectByValue(value);

	}
	
	public static void selectByVisibleTextUsingId(WebElement element, String visibleText) {

		s = new Select(element);
		s.selectByVisibleText(visibleText);

	}
	
	public static void selectByVisibleTextUsingName(WebElement element, String visibleText) {

		s = new Select(element);
		s.selectByVisibleText(visibleText);

	}
	
	public static void selectByVisibleTextUsingClassName(WebElement element, String visibleText) {

		s = new Select(element);
		s.selectByVisibleText(visibleText);

	}
	
	public static void selectByVisibleTextUsingXpath(WebElement element, String visibleText) {

		s = new Select(element);
		s.selectByVisibleText(visibleText);

	}
	
	public static void deSelectByUsingVisibleText(WebElement element, String visibleText) {

		s = new Select(element);
		s.deselectByVisibleText(visibleText);

	}
	
	public static void deSelectByUsingValue(WebElement element, String value) {

		s = new Select(element);
		s.deselectByValue(value);

	}
	
	public static void deSelectByUsingIndex(WebElement element, int indexValue) {

		s = new Select(element);
		s.deselectByIndex(indexValue);

	}
	
	public static void deSelectAllElements(WebElement element) {

		s = new Select(element);
		s.deselectAll();

	}
	
	
/* ======================================== READ ALL DATAS FROM EXCEL ============================================= */
	
	public static void readAllDatasFromExcel(String locationPath, String sheetName) throws IOException {

		// Excel sheet path
		File f = new File(locationPath);

		// Read the excel sheed
		FileInputStream toReadFile = new FileInputStream(f);

		// Read the xlsx in excel
		Workbook toReadXlsxFile = new XSSFWorkbook(toReadFile);

		// Get Sheet
		Sheet sheet = toReadXlsxFile.getSheet(sheetName);

		String value = " ";

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row2 = sheet.getRow(i);

			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {

				Cell allCel = row2.getCell(j);

				int cellType = allCel.getCellType();

				if (cellType == 1) {

					value = allCel.getStringCellValue();

				} else if (DateUtil.isCellDateFormatted(allCel)) {

					Date dateCellValue = allCel.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
					value = sdf.format(dateCellValue);
				} else {
					double numericCellValue = allCel.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
				}

				System.out.println(value);

			}
		}

	}

/* ============================================================ CREATE NEW SHEET AND WRITE DATAS =================================================== */	
	
	public static void createNewExcelFileAndWrite(String locationPath , String giveValue , int rowNum , int cellNum) throws IOException {
		
		File f = new File(locationPath);
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet create = wb.createSheet();
		
		Row particularRow = create.createRow(rowNum);
		
		Cell particularCell = particularRow.createCell(cellNum);
		
		particularCell.setCellValue(giveValue);
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		System.out.println("file writed");

	}
	
/* ========================================================== WRITE DATA TO PARTICULAR CELL IN EXCEL ===================================================== */	
	
	public static void writeDataToParticularCell(int particularRow, int particularCellFromRow , String insertData) throws IOException {
		
		File source = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Student.xlsx");

		FileInputStream fis = new FileInputStream(source);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");
		
		sheet.getRow(particularRow).createCell(particularCellFromRow).setCellValue(insertData);
				
		FileOutputStream fos = new FileOutputStream(source);
		wb.write(fos);
		
		System.out.println("file writed");

	}
	
/* ========================================================== UPDATE DATA TO PARTICULAR CELL IN EXCEL ===================================================== */	

	public static void updateDataToParticularCell(String location, String sheetName, int particularRow,
			int particularCellFromRow, String presentedData, String insertData) throws IOException {

		File f = new File(location);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(particularRow);

		Cell cell = row.getCell(particularCellFromRow);

		String value = cell.getStringCellValue();
		
		if (value.equals(presentedData)) {
			
			cell.setCellValue(insertData);
			
		}

		 FileOutputStream fos = new FileOutputStream(f);
		 wb.write(fos);

		System.out.println("file writed");

	}
	
	public static void located() {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gender-radio-1']")));

	}
	
	
	public static void rowAndColumnCount(String locationPath, String sheetName) throws IOException {
		File f = new File(locationPath);

		// Read the excel sheed
		FileInputStream toReadFile = new FileInputStream(f);

		// Read the xlsx in excel
		Workbook toReadXlsxFile = new XSSFWorkbook(toReadFile);

		// Get Sheet
		Sheet sheet = toReadXlsxFile.getSheet(sheetName);
		
		int row = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Rows : "+sheet.getPhysicalNumberOfRows());
		Row rows = sheet.getRow(0);
		System.out.println("Number of cells presented in each row : "+rows.getPhysicalNumberOfCells());


	}
	
	// =====================================================================================
	
	public static void createRow(int createRow)
			throws IOException {

		File source = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Student.xlsx");

		FileInputStream fis = new FileInputStream(source);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		sheet.createRow(createRow);

		FileOutputStream fos = new FileOutputStream(source);
		wb.write(fos);

		System.out.println("file writed");

	}
	
	// ================================================================================
	
	public static String question5(int particularRow, int particularCellFromRow) throws IOException {

		File f = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Question5.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		Row row = sheet.getRow(particularRow);

		Cell cell = row.getCell(particularCellFromRow);
		
		int cellType = cell.getCellType();

		String value = " ";

		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			value = sdf.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
