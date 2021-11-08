package Addainwebsite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import net.bytebuddy.asm.Advice.Return;

public class Addain1 {
	WebDriver driver;

	public void browserLanuch(String url ) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
	}
	public void entertext(WebElement element,String text ) {
		element.sendKeys(text);

	}public void click(WebElement element) {
		element.click();

}public String getattribut(WebElement element,String attributeName) {
String attribute = element.getAttribute(attributeName);
return attribute;
}
	
	public String excelRead(String path,String sheetName,int rowindex, int cellindex) throws IOException {
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
	
}public void excelWrite(String path,String sheetName,int rowindex, int cellindex,String value) throws IOException {
	File f=new File(path);
	FileOutputStream s=new FileOutputStream(f);
	Workbook w=new XSSFWorkbook();
	Sheet createsheet = w.createSheet(sheetName);
	Row createrow = createsheet.createRow(rowindex);
	Cell createCell = createrow.createCell(cellindex);
	createCell.setCellValue(value);
w.write(s);


	
	


}
//public void thread(int num) throws InterruptedException {
//	
//	Thread.sleep(num);
//	
//}



public void selectby(WebElement element,int a ) {
  Select s2 = new Select(element);
  s2.selectByIndex(a);

}public WebElement locators(String locatorType,String value) {
	WebElement findelement = driver.findElement(By.xpath(value));
    return findelement;
}












public static void main(String[] args) throws IOException, InterruptedException {
Addain1 y=new Addain1();	
	y.browserLanuch("http://adactinhotelapp.com/");
	WebElement txtusername = y.locators("xpath", "//input[@name='username']");
	String username = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 0);
	y.entertext(txtusername, username);
	WebElement txtpassword = y.locators("xpath", "//input[@name='password']");
	String  password = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 1);
	y.entertext(txtpassword, password);
	WebElement btnlogin = y.locators("xpath", "//input[@name='login']");
	y.click(btnlogin);
	WebElement locationselect = y.locators("xpath", "//select[@name='location']");
	String  ic1 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 2);
	int parseInt = Integer.parseInt(ic1);
	y.selectby(locationselect, parseInt);
	WebElement locationshotel = y.locators("xpath", "//select[@name='hotels']");
	String  ich1 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 3);
	int parseInt1 = Integer.parseInt(ich1);
	y.selectby(locationshotel, parseInt1);
	WebElement locationrm = y.locators("xpath", "//select[@name='room_nos']");
	String  icrt1 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 4);
	int parseInt2 = Integer.parseInt(icrt1);
	y.selectby(locationrm, parseInt2);
	WebElement locationrm1 = y.locators("xpath", "//select[@name='room_type']");
	String  icrt11 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 5);
	int parseInt21 = Integer.parseInt(icrt11);
	y.selectby(locationrm1, parseInt21);
	WebElement locationapr = y.locators("xpath", "//select[@name='adult_room']");
	String  icapr1 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 6);
	int parseInt3 = Integer.parseInt(icapr1);
	y.selectby(locationapr, parseInt3);
	
	WebElement locationcr = y.locators("xpath", "//select[@name='child_room']");
	String  iccr1 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 6);
	int parseInt4 = Integer.parseInt(iccr1);
	y.selectby(locationcr, parseInt4);	
	WebElement datecheck = y.locators("xpath", "//input[@name='datepick_in']");
	datecheck.clear();
	Thread.sleep(3000);
	String username1 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 7);
	y.entertext(datecheck, username1);
	WebElement datecheckout = y.locators("xpath", "//input[@name='datepick_out']");
	datecheckout.click();
	Thread.sleep(3000);
	String username2 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 8);
	y.entertext(datecheckout, username2);
Thread.sleep(3000);
	WebElement search = y.locators("xpath", "//input[@name='Submit']");
	y.click(search);
	WebElement radio = y.locators("xpath", "//input[@name='radiobutton_0']");
	y.click(radio);
	WebElement clickcontinue = y.locators("xpath", "//input[@name='continue']");
	y.click(clickcontinue);
	WebElement txtfirst = y.locators("xpath", "//input[@name='first_name']");
	String first = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 9);
	y.entertext(txtfirst, first);
	WebElement txtlast = y.locators("xpath", "//input[@name='last_name']");
	String last = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 10);
	y.entertext(txtlast, last);
	WebElement txtaddres = y.locators("xpath", "//textarea[@name='address']");
	String address = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 11);
	y.entertext(txtaddres, address);
	WebElement txtcredit = y.locators("xpath", "//input[@name='cc_num']");
	String credit = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 12);
	y.entertext(txtcredit, credit);
	WebElement locationcc = y.locators("xpath", "//select[@name='cc_type']");
	String  icccc = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 13);
	int parseIntc = Integer.parseInt(icccc);
	y.selectby(locationcc, parseIntc);
	WebElement locationcc1 = y.locators("xpath","//select[@name='cc_exp_month']");
	String  icccc1 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 14);
	int parseIntc1 = Integer.parseInt(icccc1);
	y.selectby(locationcc1, parseIntc1);
	WebElement locationcc2 = y.locators("xpath", "//select[@name='cc_exp_year']");
	String  icccc2 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 15);
	int parseIntc2= Integer.parseInt(icccc2);
	y.selectby(locationcc2, parseIntc2);
	WebElement txtusername222 = y.locators("xpath", "//input[@name='cc_cvv']");
	String username222 = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 16);
	y.entertext(txtusername222, username222);
	WebElement clickcontinue1 = y.locators("xpath", "//input[@name='book_now']");
	y.click(clickcontinue1);
	Thread.sleep(10000);
	WebElement txtusername2222 = y.locators("xpath", "//input[@id='order_no']");
 String getattribut = y.getattribut(txtusername2222, "value");
 y.excelWrite("E:\\my documents\\t2.xlsx", "Sheeet1", 0, 0, getattribut);





}
	
	



























}
