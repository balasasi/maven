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

public class SinglecellRead {
public static void main(String[] args) throws IOException  {
	//create object for file
	File f=new File("E:\\my documents\\Book1.xlsx");
//to read file
FileInputStream wa= new FileInputStream(f);
//to read the excel
Workbook w =new XSSFWorkbook(wa);
//to read the sheat 
Sheet sheet = w.getSheet("Sheet1");
//to read the rows
Row row = sheet.getRow(0);
//to read cell
Cell cell = row.getCell(0);
//toread String data
String stringCellValue = cell.getStringCellValue();
System.out.println(stringCellValue);










}
}
