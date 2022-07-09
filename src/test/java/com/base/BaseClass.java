package com.base;

import java.awt.AWTException;

import java.awt.Dimension;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/** 
 * 
 * @author Dell
 * @Description to maintain the reusable methods
 * @CreationDate 25/06/2022
 * 
 */

public class BaseClass {

	public static final String Value = null;
	public static WebDriver driver;
	/**
	 * 
	 * @param browserType
	 * @CreationDate 25/06/2022
	 * @Description used to launch browser
	 */

	// 1.to launch Browser
	public static void getDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}
	/**
	 * 
	 * @param name
	 * @return WebElement
	 * @CreationDate 25/06/2022
	 * Description to find the locator by using id
	 * 
	 * 
	 */
	// 2.to get url
	public WebElement findElementByValue(String name) {
		WebElement findElement = driver.findElement(By.id(name));
		return findElement;
	}
	/**
	 * 
	 * @return String
	 * @CreationDate 25/06/2022
	 * Description to find the Title
	 * Description to get the Title
	 */

	// 3.to get title
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	/**
	 * 
	 * @return String
	 * @CreationDate 25/06/2022
	 * @Description to get currenturl
	 */

	// 4.to get current url
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	/**
	 * 
	 * @return string
	 *  @CreationDate 25/06/2022
	 *  @Description to handle the windows
	 */
	// 5.to handle single window
	public String windowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}
	/**
	 * 
	 * @return String
	 *  @CreationDate 25/06/2022
	 * @Description to handle the pageSource
	 */


	// 6.to get page source
	public String getPageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;

	}
	/**
	 * @CreationDate 25/06/2022
	 * @Description to close the current window
	 */
	// 7.to close the current window
	public void closeWindow() {
		driver.close();

	}
	/**
	 * @CreationDate 25/06/2022
	 * @Description to close all windows
	 */
	// 8. to close all windows
	public static void closeAllWindow() {
		driver.quit();

	}
	/**
	 * 
	 * @param element
	 *  @CreationDate 25/06/2022
	 *  @Description to send the text
	 *  
	 */
	// 9.to type text
	public void sendText(WebElement element, String data) {
		element.sendKeys(data);

	}
	/**
	 * 
	 * @param element
	 * @CreationDate 25/06/2022
	 * @Description click the button
	 */
	// 10.to click button
	public void clickButton(WebElement element) {
		element.click();

	}
	/**
	 * 
	 * @param element
	 *  @CreationDate 25/06/2022
	 *  @Description to submit the element
	 */
	// 11.to click submit
	public void submit(WebElement element) {
		element.submit();

	}
	/**
	 * 
	 * @param element
	 * @return Point
	 * @CreationDate 25/06/2022
	 * @Description to get the location
	 */
	// 12.to get the location of the file

	public Point getLocation(WebElement element) {
		Point location = element.getLocation();
		return location;

	}
	/**
	 * 
	 * @param element
	 * @param value
	 * @return String
	 * @CreationDate 25/06/2022
	 * @Description  to get the attribute value
	 */
	// 13. to get attribute
	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;

	}
	/**
	 * 
	 * @param element
	 * @return String
	 * @CreationDate 25/06/2022
	 * @Description to get the attribute value
	 */
	// 14.to get attribute
	public String getAttribute2(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}
	/**
	 * 
	 * @param element
	 * @return Boolean
	 * @CreationDate 25/06/2022
	 * @Description to check it is enabled
	 */
	// 15. to check it is enabled
	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	/**
	 * 
	 * @param element
	 * @return boolean
	 * @CreationDate 25/06/2022
	 * @Description to check it is displayed
	 */
	// 16.to check it is displayed
	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	/**
	 * 
	 * @param element
	 * @return boolean
	 * @CreationDate 25/06/2022
	 * @Description to check it is selected
	 */
	// 17.to check it is selected
	public boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}
	/**
	 * 
	 * @param element
	 * @return String
	 *  @CreationDate 25/06/2022
	 *  @Description to get the text
	 */
	// 18.to get the text
	public String getText1(WebElement element) {
		String text = element.getText();
		return text;

	}
	/**
	 * 
	 * @param element
	 * @return String
	 * @CreationDate 25/06/2022
	 * @Description to get the tagname
	 */
	// 19.to get the tagname
	public String toGetTagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;

	}
	/**
	 * @CreationDate 25/06/2022
	 * @Description to maximize the window
	 */
	// 20. to maximize the window
	public static void maximize() {
		driver.manage().window().maximize();

	}
	/**
	 * 
	 * @param x
	 * @param y
	 * @return Point
	 * @CreationDate 25/06/2022
	 * @Description to set the point of window
	 * 
	 */
	// 21.to set the point of window
	public Point setPoint(int x, int y) {
		Point p = new Point(x, y);
		driver.manage().window().setPosition(new Point(x, y));
		return p;
	}
	/**
	 * 
	 * @param width
	 * @param height
	 * @return Dimension
	 * @CreationDate 25/06/2022
	 * @Description to set the dimension of the window
	 */
	// 22.to set the dimension of the window
	public Dimension setDimension(int width, int height) {
		Dimension d = new Dimension(width, height);
		return d;
	}
	/**
	 * 
	 * @param element
	 * @CreationDate 25/06/2022
	 * @Description to perform MouseHover action
	 */
	// 23.to perform MouseHover action
	public void performMouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

	}
	/**
	 * 
	 * @param element
	 *  @CreationDate 25/06/2022
	 *   @Description to perform MouseHover action
	 */
	// 24.to perform click action
	public void click(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();

	}
	/**
	 * 
	 * @param element
	 * @CreationDate 25/06/2022
	 * @Description to perform doubleclick
	 * 
	 */
	// 25.to perform doubleclick
	public void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();

	}
	/**
	 * 
	 * @param element
	 * @CreationDate 25/06/2022
	 * @Description to perform a right click
	 */
	// 26.to perform a right click
	public void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();

	}
	/**
	 * 
	 * @param source
	 * @param target
	 * @CreationDate 25/06/2022
	 * @Description to perform a drag and drop
	 */
	// 27. to perform a drag and drop

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();

	}
	/**
	 * 
	 * @param keycode
	 * @throws AWTException
	 *  @CreationDate 25/06/2022
	 *  @Description to perform key press
	 */
	// 28.to perform key press
	public void keyPress(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyPress(keycode);

	}
	/**
	 * 
	 * @param keycode
	 * @throws AWTException
	 * @CreationDate 25/06/2022
	 * @Description to perform key release
	 */
	// 29.to perform key release
	public void keyRelease(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyRelease(keycode);
	}
	/**
	 * 
	 * @param element
	 * @param text
	 * @CreationDate 25/06/2022
	 * @Description to pass text using javascript
	 */
	// 30. to pass text using javascript
	public void typeJs(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].('value','" + text + "')", element);

	}
	/**
	 * 
	 * @param element
	 * @CreationDate 25/06/2022
	 * @Description to perform click using javascrpit
	 * 
	 */
	// 31.to perform click using javascrpit
	public void Button(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].click()", element);

	}
	/**
	 * 
	 * @param location
	 * @throws IOException
	 *  @CreationDate 25/06/2022
	 *  @Description to take screenshot
	 */
	// 32.to take screenshot
	public void takeScreeenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(location));
	}
	/**
	 * 
	 * @param element
	 * @param text
	 *  @CreationDate 25/06/2022
	 *@Description to perform dropdown operation using visibletext
	 *  
	 */
	// 33.to perform dropdown operation using visibletext
	public void dropDownByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}
	/**
	 * 
	 * @param element
	 * @param text
	 *  @CreationDate 25/06/2022
	 *  @Description to perform dropdown operation using attribute
	 */
	// 34.to perform dropdown operation using attribute

	public void dropDownByValue(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByValue(text);

	}
	/**
	 * 
	 * @param element
	 * @param s1
	 *  @CreationDate 25/06/2022
	 *  @Description to perform dropdown operation using by index
	 */
	// 35.to perform dropdown operation using by index
	public void dropDownByIndex(WebElement element, int s1) {
		Select s = new Select(element);
		s.selectByIndex(s1);
	}
	/**
	 * 
	 * @param element
	 * @param text
	 * @CreationDate 25/06/2022
	 *  @Description to perform dropdown operation
	 */
	// 36.to perform dropdown operation using by deselect by visibletext
	public void deselectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);

	}
	/**
	 * 
	 * @param element
	 * @param text
	 * @CreationDate 25/06/2022
	 *  @Description to perform dropdown operation using by deselect
	 * 
	 */
	// 37.to perform dropdown operation using by deselect by attribute
	public void deselectByValue(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByValue(text);

	}
	/**
	 * 
	 * @param element
	 * @param index
	 * @CreationDate 25/06/2022
	 * @Description to perform dropdown operation using by deselect by index
	 */
	// 38.to perform dropdown operation using by deselect by index
	public void deselectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}
	/**
	 * 
	 * @param element
	 * @CreationDate 25/06/2022
	 * @Description to perform dropdown operation using by deselectAll
	 */
	// 39.to perform dropdown operation using by deselectAll
	public void deselectByAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}
	/**
	 * 
	 * @param element
	 *  @CreationDate 25/06/2022
	 *  @Description to check multiple option in dropdown
	 * 
	 */
	// 40.to check multiple option in dropdown
	public void isMultiple(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();
	}
	/**
	 * 
	 * @param url
	 * @CreationDate 25/06/2022
	 * @Description to navigate to another url
	 * 
	 */
	// 41. to navigate to another url
	public void navigateUrl(String url) {
		driver.navigate().to(url);

	}
	/**
	 * @CreationDate 25/06/2022
	 * @Description navigate to forward url
	 */
	// 42.navigate to forward url
	public void navigateForward() {
		driver.navigate().forward();

	}
	/**
	 * @CreationDate 25/06/2022
	 * @Description navigate to backward url
	 */
	// 43.navigate to backward url
	public void navigateBackward() {
		driver.navigate().back();

	}
	/**
	 * @CreationDate 25/06/2022
	 * @Description navigate to refresh url
	 * 
	 */
	// 44.navigate to refresh url
	public void navigateRefresh() {
		driver.navigate().refresh();

	}
	/**
	 * 
	 * @param time
	 * @throws InterruptedException
	 * @CreationDate 25/06/2022
	 * @Description to stop the temporary execution
	 */
	// 45.to stop the temporary execution for a while
	public void sleep(int time) throws InterruptedException {
		Thread.sleep(time);

	}
	/**
	 * 
	 * @param time
	 * @CreationDate 25/06/2022
	 * @Description to stop the time being execution till executes
	 */
	// 46.to stop the time being execution till executes
	public static void implicitWaits(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	/**
	 * 
	 * @param index
	 * @CreationDate 25/06/2022
	 * @Description switch to frame using index 
	 */
	// 47.switch to frame using index
	public void frameIndex(int index) {
		driver.switchTo().frame(index);

	}
	/**
	 * 
	 * @param text
	 * @CreationDate 25/06/2022
	 * @Description switch to frame using frameValue
	 */
	// 48.switch to frame using frameValue
	public void frameValue(String text) {
		driver.switchTo().frame(text);

	}
	/**
	 *  @CreationDate 25/06/2022
	 *  @Description switch to parent frame using frame
	 * 
	 */
	// 49.switch to parent frame using frame
	public void frameParent() {
		driver.switchTo().parentFrame();

	}
	/**
	 * 
	 * @param element
	 * @CreationDate 25/06/2022
	 *  @Description switch to frame using refelement
	 */
	// 50.switch to frame using refelement
	public void frameReference(String element) {
		driver.switchTo().frame(element);

	}
	/**
	 * 
	 * @param id
	 * @return WebElement 
	 *  @CreationDate 25/06/2022
	 *   @Description to findelement using id
	 * 
	 */
	// 51. to findelement using id
	public WebElement findElementById2(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;

	}
	/**
	 * 
	 * @param name
	 * @return WebElement
	 *  @CreationDate 25/06/2022
	 *  @Description to findelement using name
	 * 
	 */
	// 52. to findelement using name
	public WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;

	}
	/**
	 * 
	 * @param name
	 * @return WebElement
	 *  @CreationDate 25/06/2022
	 *  @Description  to findelement using className
	 *  
	 */
	// 53. to findelement using className
	public WebElement findElementByclassName(String name) {
		WebElement element = driver.findElement(By.className(name));
		return element;

	}
	/**
	 * 
	 * @param name
	 * @return WebElement
	 * @CreationDate 25/06/2022
	 * @Description to findelement using tagName
	 * 
	 * 
	 */
	// 54. to findelement using tagName
	public WebElement findElementByTagName(String name) {
		WebElement element = driver.findElement(By.tagName(name));
		return element;

	}
	/**
	 * 
	 * @param xpathExpression
	 * @return WebElement
	 * @CreationDate 25/06/2022
	 * @Description to findelement using attributeName
	 * 
	 */
	// 55. to findelement using attributeName
	public WebElement xpathValue(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;

	}
	/**
	 * @CreationDate 25/06/2022
	 *  @Description switch to alert click ok
	 */
	// 56. switch to alert click ok
	public void simpleAlerts() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	/**
	 * @CreationDate 25/06/2022
	 * @Description switch to alert click ok
	 */
	// 57. switch to alert click ok
	public void confrimAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	/**
	 * 
	 * @param element
	 * @param tagName
	 * @return WebElement
	 * @CreationDate 25/06/2022
	 * @Description to findelements using tagname 
	 * 
	 */
	// 58. to findelements using tagname
	public List<WebElement> findElementsUsingTagName(WebElement element, String tagName) {
		List<WebElement> findElements = driver.findElements(By.tagName(tagName));
		return findElements;
	}
	/**
	 * 
	 * @param name
	 * @return WebElement
	 * @CreationDate 25/06/2022
	 *  @Description to findelement using linkText
	 * 
	 */
	// 59. to findelement using linkText
	public WebElement findElementByLinkText(String name) {
		WebElement element = driver.findElement(By.linkText(name));
		return element;

	}
	/**
	 * 
	 * @param name
	 * @return WebElement
	 * @CreationDate 25/06/2022
	 *  @Description to findelement using PartialLinkText 
	 * 
	 */
	// 60.to findelement using PartialLinkText
	public WebElement findElementByPartialLinkText(String name) {
		WebElement element = driver.findElement(By.partialLinkText(name));
		return element;
	}
	/**
	 * 
	 * @param name
	 * @return WebElement
	 * @CreationDate 25/06/2022
	 * @Description to findelement using cssSelector 
	 * 
	 */
	// 61.to findelement using cssSelector
	public WebElement findElementByCssSelector(String name) {
		WebElement element = driver.findElement(By.cssSelector(name));
		return element;
	}
	/**
	 * 
	 * @param element
	 * @return WebElement
	 * @CreationDate 25/06/2022
	 * @Description to get the size of element
	 */
	// 62.to get the size of element
	public org.openqa.selenium.Dimension getSize(WebElement element) {
		org.openqa.selenium.Dimension size = element.getSize();
		// System.out.println(size.width);
		// System.out.println(size.height);
		return size;
	}
	/**
	 * 
	 * @param element
	 * @CreationDate 25/06/2022
	 * @Description to clear text
	 */
	// 63.to clear text
	public void clearText(WebElement element) {

		element.clear();
	}
	/**
	 * 
	 * @param url
	 * @CreationDate 25/06/2022
	 * @Description loadUrl
	 * 
	 */
	// 64.loadUrl
	public static void loadUrl(String url) {
		driver.get(url);

	}
	/**
	 * 
	 * @param sheetName
	 * @param rowindex
	 * @param cellindex
	 * @return String
	 * @throws IOException
	 * @CreationDate 25/06/2022
	 * @Description read data from excel
	 * 
	 */
	// 65.read data from excel
	@SuppressWarnings("resource")
	public String getData(String sheetName, int rowindex, int cellindex) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\NewMaven\\Excel\\HotelBook.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowindex);
		Cell cell = row.getCell(cellindex);
		CellType celltype = cell.getCellType();
		switch (celltype) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date datecellvalue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
				res = dateformat.format(datecellvalue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				// BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				long l = (long) numericCellValue;
				res = String.valueOf(l);
			}
			break;

		default:
			break;
		}
		return res;
	}
	/**
	 * 
	 * @param sheetName
	 * @param rowindex
	 * @param cellindex
	 * @param olddata
	 * @param newdata
	 * @throws IOException
	 *  @CreationDate 25/06/2022
	 * @Description update value in excel 
	 */
	// 66.update value in excel
	@SuppressWarnings({ "resource", "unused" })
	public void upateData(String sheetName, int rowindex, int cellindex, String olddata, String newdata)
			throws IOException {
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\NewMaven\\Excel\\MavenTest.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowindex);
		Cell cell = row.getCell(cellindex);
		CellType celltype = cell.getCellType();
		String value = cell.getStringCellValue();

		if (value.equals(olddata)) {
			cell.setCellValue(newdata);

		}
		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);

	}
	/**
	 * 
	 * @param sheetName
	 * @param rowindex
	 * @param cellindex
	 * @param data
	 * @throws IOException
	 * @CreationDate 25/06/2022
	 * @Description insert value in excel
	 * 
	 */
	// 67.insert value in excel
	@SuppressWarnings("resource")
	public void writeData(String sheetName, int rowindex, int cellindex, String data) throws IOException {
		File file = new File("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\NewMaven\\\\Excel\\\\HotelBook.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowindex);
		Cell cell = row.createCell(cellindex);
		cell.setCellValue(data);

		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);

	}
	/**
	 * 
	 * @param string
	 * @return String
	 *  @CreationDate 25/06/2022
	 *   @Description get AttributeValue 
	 * 
	 */
	// 68.get AttributeValue
	public String getAttribute(String string) {
		WebElement att = driver.findElement(By.id(string));
		att.getAttribute(Value);
		return null;
	}
	/**
	 * 
	 * @param key
	 * @return String
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @CreationDate 25/06/2022
	 * @Description to get property file value
	 * 
	 */
	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\AdactinOMRBranchAutomation\\config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;

	}

}
