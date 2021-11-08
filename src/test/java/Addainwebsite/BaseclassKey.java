package Addainwebsite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class BaseclassKey {
	 static WebDriver driver;

	public  static void browserLanuch(String url ) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
	}
	public static void entertext(WebElement element , String Text) {
	element.sendKeys(Text);

	}

	public static void click(WebElement element) {
		element.click();

}public static String getattribut(WebElement element,String attributeName) {
String attribute = element.getAttribute(attributeName);
return attribute;
}
	
	public static String excelRead(String path,String sheetName,int rowindex, int cellindex) throws IOException {
	File f=new File(path);
	FileInputStream s=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(s);
	Sheet sheet = w.getSheet(sheetName);
	Row row = sheet.getRow(rowindex);
	Cell cell = row.getCell(cellindex);
	int cellType = cell.getCellType();
	if (cellType==1) {
		String stringCellValue = cell.getStringCellValue();
	return stringCellValue;	
	}else if (DateUtil.isCellDateFormatted(cell)) {
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat s1 =new SimpleDateFormat("dd/MM/yyy");
	String format = s1.format(dateCellValue);
	return format;
	
}else {
   double numericCellValue = cell.getNumericCellValue();
   long l =(long)numericCellValue;
   String valueOf = String.valueOf(l);
   return valueOf;}
	
}public static void excelWrite(String path,String sheetName,int rowindex, int cellindex,String value) throws IOException {
	File f=new File(path);
	FileOutputStream s=new FileOutputStream(f);
	Workbook w=new XSSFWorkbook();
	Sheet createsheet = w.createSheet(sheetName);
	Row createrow = createsheet.createRow(rowindex);
	Cell createCell = createrow.createCell(cellindex);
	createCell.setCellValue(value);
w.write(s);


	
	


}
public static void thread(int num) throws InterruptedException {
		Thread.sleep(num);
}



public static void selectby(WebElement element,int a ) {
  Select s2 = new Select(element);
  s2.selectByIndex(a);







}public static  WebElement webLocators(String  locatorstype,String value) {
	if(locatorstype.equals("id")) {
	WebElement findElement = driver.findElement(By.id(value));
	return findElement;}
	else if (locatorstype .equals("name")) {
//public  WebElement webLocators1(String  locatorstype,String value) {
	WebElement findElement = driver.findElement(By.name(value));
	return findElement;}
	else{
//public  WebElement click(String  locatorstype,String value) {
	WebElement findElement = driver.findElement(By.xpath(value));
	return findElement;}}



}





