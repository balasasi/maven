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

public class Mobilenolong {
public static void main(String[] args) throws IOException {
//to read the file
	File f=new File("E:\\my documents\\Book1.xlsx");
	//to read the file
	FileInputStream w=new FileInputStream(f);
//to read excel
	Workbook e= new XSSFWorkbook(w);
//to read sheet
	Sheet sheet = e.getSheet("Sheet1");


//to find the number of rows filled  with dat
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	//for literate each row
	for (int i = 0; i < physicalNumberOfRows; i++) {
		Row row = sheet.getRow(i);	
//to find the number of cells in each rows
int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//for literate each cell
for (int j = 0; j < physicalNumberOfCells; j++) {
	Cell cell = row.getCell(j);
int cellType = cell.getCellType();
if (cellType==1) {
	String stringCellValue = cell.getStringCellValue();
	System.out.print("\t"+"\t"+stringCellValue);
} else {
	double numericCellValue = cell.getNumericCellValue();
System.out.print("\t"+numericCellValue);
long l=(long)numericCellValue;
System.out.print("\t"+l);}
	}System.out.println("\t");
	






	}
}}

