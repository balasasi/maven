package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taskwebtable {
public static void main(String[] args) throws IOException  {
	WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();	
	
	File f=new File("E:\\my documents\\Book1.xlsx");
	FileOutputStream steam =new FileOutputStream(f);
	Workbook we=new XSSFWorkbook();
	    Sheet createSheet = we.createSheet("Sheet2");
	    Row createRow = createSheet.createRow(0);
driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
WebElement table= driver.findElement(By.tagName("table"));
WebElement heading = table.findElement(By.tagName("thead"));
WebElement headingrow = heading.findElement(By.tagName("tr"));
List<WebElement> headingElements = headingrow.findElements(By.tagName("th"));
int size = headingElements.size();
for (int i = 0; i < size; i++) {
	WebElement headingdataElements = headingElements.get(i);
	String text = headingdataElements.getText();
	}
WebElement content = table.findElement(By.tagName("tbody"));
	List<WebElement> rows = content.findElements(By.tagName("tr"));
for (int  j= 1;  j<rows.size(); j++) {
	WebElement row = rows.get(j);
	Row createRow2 = createSheet.createRow(j);
List<WebElement> findElements = row.findElements(By.tagName("td"));
for (int k = 0; k < findElements.size(); k++) {
	WebElement dataElement = findElements.get(k);
	
	
	
	String text = dataElement.getText();


	Cell createCell = createRow.createCell(j);
	createCell.setCellValue(text);
	
	
	
	
}


}






we.write(steam);
}



}

