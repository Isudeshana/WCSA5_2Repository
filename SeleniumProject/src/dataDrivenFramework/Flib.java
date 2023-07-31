package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
    //to store generic reusable methods
	//all the methods are non static
	public String readExcelData(String excelPath, String sheetName, int rowc, int cellc) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rowc);
	Cell cell = row.getCell(cellc);
	String data = cell.getStringCellValue();
	return data;
	}
	// it is use to get last count of row where we store data
	public int getLastRowCount(String excelPath, String sheetName ) throws IOException
	{
	 FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	int rc = sheet.getLastRowNum();
	return rc;
	}
	//it is used to write the data into excelsheet
	public void writeExcelData(String excelPath, String SheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(SheetName);
	Row row = sheet.getRow(cellCount);
	Cell cell = row.createCell(cellCount);
	cell.setCellValue(data);
	FileOutputStream fos = new FileOutputStream(excelPath);
	wb.write(fos);
	}
}
