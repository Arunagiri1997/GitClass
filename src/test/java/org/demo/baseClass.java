package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public static WebDriver driver;
	public static void chromebrowserLaunch() {
		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();

	}
	public void firefoxBrowserLaunch() {
		WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();

	}
	public void edgeBrowserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static  void loadUrl(String Url) {
		driver.get(Url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}
	public void waits() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public  String currentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public  String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String getAttribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}
	public void switchTo() {
		driver.switchTo();
	}
	public static void browserClose() {
		driver.close();
	}
	public void quitBrowse() {
		driver.quit();
	}
	public void sendValue(WebElement element,String text) {
		element.sendKeys(text);
	}
	public void click(WebElement w) {
		w.click();
	}
	public void clear(WebElement element) {
		element.clear();
	}
	public boolean enable(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public Point location(WebElement element) {
		Point location = element.getLocation();
		return location;
	}
	public  int xValue(Point p) {
		int x = p.getX();
		return x;
	}
	public int yValue(Point p) {
		int y = p.getY();
		return y;
	}
	public String getCssValue(WebElement e,String name) {
		String cssValue = e.getCssValue(name);
		return cssValue;
	}
	public Dimension size(WebElement e) {
		Dimension size = e.getSize();
		return size;
	}
	public void selectByIndex(WebElement e,int i) {
		Select s = new Select(e);
		s.selectByIndex(i);
	}
	public void selectByVisibleText(WebElement e,String text) {
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}
	public void selectByValue(WebElement e,String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}
	public List<WebElement> options(WebElement w) {
		Select s= new Select (w);
		List<WebElement> options = s.getOptions();
		return options;
	}
	public boolean isMultiple(WebElement element) {
		Select s= new Select (element);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	public List<WebElement> allSelectedOptions(WebElement element) {
		Select s= new Select (element);
		List<WebElement> allOptions = s.getAllSelectedOptions();
		return allOptions;

	}
	public void deselectByIndex(WebElement e,int i) {
		Select s= new Select (e);
		s.deselectByIndex(i);
	}
	public void deselectByVisibleText(WebElement e,String text) {
		Select s= new Select (e);
		s.deselectByVisibleText(text);
	}
	public void deselectByValuet(WebElement e,String value) {
		Select s= new Select (e);
		s.deselectByVisibleText(value);
	}
	public Alert acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return alert;
	}
	public Alert ConfirmAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		return alert;
	}
	public Alert promptAlert(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		return alert;
	}
	public String textFromAlert(WebElement e) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	public  void isSelected(WebElement element) {
		element.click();
	}
	public String getWindowHandle() {
		String handle = driver.getWindowHandle();
		return handle;
	}
	public Set<String> getWindowHandles() {
		Set<String> handles = driver.getWindowHandles();
		return handles;
	}
	public void SwitchFrameByIndex(int i) {
		driver.switchTo().frame(i);
	}
	public void switchFrameByName(String name) {
		driver.switchTo().frame(name);
	}
	public void switchFrameById(String id) {
		driver.switchTo().frame(id);
	}
	public void parentFrame() {
		driver.switchTo().parentFrame();
	}
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}
	public Actions moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		Actions result = a.moveToElement(target);
		result.perform();
		return result;
	}
	public Actions dragAndDrop(WebElement e1,WebElement e2) {
		Actions a = new Actions(driver);
		Actions result = a.dragAndDrop(e1, e2);
		result.perform();
		return result;
	}
	public Actions doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		Actions result = a.doubleClick(e);
		result.perform();
		return result;
	}
	public Actions rightClick(WebElement e) {
		Actions a = new Actions(driver);
		Actions result = a.contextClick(e);
		result.perform();
		return result;
	}
	public void takesScreenshot(String path,File src,File dest) throws Exception {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File fsrc = ts.getScreenshotAs(OutputType.FILE);
		File fdest = new File (path);
		FileUtils.copyFile(src, dest);
	}
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void navigateBackward() {
		driver.navigate().back();
	}
	public void refresh() {
		driver.navigate().refresh();
	}

	public String getData(String Sheetname,int rownum,int cellnum) throws Exception {
		String value= null;
		File f = new File ("C:\\Users\\AK\\eclipse-workspace\\FirstMaven\\Excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w= new XSSFWorkbook(stream);
		Sheet s = w.getSheet(Sheetname);
		Row r = s.getRow(rownum);
		Cell c = r.getCell(cellnum);
		int type = c.getCellType();
		if(type==1) {
			value = c.getStringCellValue();
		}
		if(type==0) {
			if(DateUtil.isCellDateFormatted(c)){
				Date date = c.getDateCellValue();
				SimpleDateFormat d= new SimpleDateFormat("dd-MM-yyyy");
				value= d.format(date);
			}else {
				double d = c.getNumericCellValue();
				long l =  (long)d;
				value = String.valueOf(l);

			}
		}
		return value;


	}



}


























