package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassinxcel {
WebDriver driver;
	public void browser(String url) {
		WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
driver.get(url);     
	}
private void excelRead(String path,String sheet,int row,int cell) throws IOException {
	File f=new File(path);
FileInputStream stream=new FileInputStream(f);
Workbook wA = new XSSFWorkbook(stream);
Sheet sheet2 = wA.getSheet(sheet);
Row row2 = sheet2.getRow(row);
	Cell cell2 = row2.getCell(cell);
	int cellType = cell2.getCellType();
	if (cellType==1) {
		String stringCellValue = cell2.getStringCellValue();
		
	}
	
	
	
	
	
	
	
	
}































}
