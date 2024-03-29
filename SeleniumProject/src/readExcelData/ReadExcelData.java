package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 FileInputStream Fis = new FileInputStream("./data/ReadSingleData.xlsx");
	 
	 Workbook wb = WorkbookFactory.create(Fis);
	 Sheet sheet = wb.getSheet("IPL");
	 Row row = sheet.getRow(2);
	 Cell cell = row.getCell(1);
	 String data = cell.getStringCellValue();
	 System.out.println(data);
}
}
