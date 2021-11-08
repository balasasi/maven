package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateAdding {
public static void main(String[] args) throws IOException {
	File f =new File("E:\\my documents\\Book1.xlsx");
	FileInputStream steam=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(steam);
    Sheet sheet = w.getSheet("Sheet1");
   int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
   for (int i = 0; i < physicalNumberOfRows; i++) {
	Row row = sheet.getRow(i);
int physicalNumberOfCells = row.getPhysicalNumberOfCells();
for (int j = 0; j < physicalNumberOfCells; j++) {
	Cell cell = row.getCell(j);
int cellType = cell.getCellType();
if (cellType==1) {
	String stringCellValue = cell.getStringCellValue();
	System.out.print("\t"+"\t"+stringCellValue);
}else if (DateUtil.isCellDateFormatted(cell)) {
	Date dateCellValue = cell.getDateCellValue();
	System.out.print("\t"+dateCellValue);
SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
String format = s.format(dateCellValue);
System.out.print("\t"+format);}
else {
double numericCellValue = cell.getNumericCellValue();
System.out.print("\t"+numericCellValue);
long l=(long)numericCellValue;
System.out.print("\t"+l);
}   
   }System.out.println();












}}}

