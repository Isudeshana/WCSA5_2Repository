package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ValidLoginTestCase { 
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.msedge.driver","./driver.msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-1ge4rpa/login.do");
		
		
	FileInputStream fis1 = new FileInputStream("./data/TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	Sheet sheet = wb.getSheet("validcreds");
      Row row = sheet.getRow(1);
      Cell cell = row.getCell(0);
      String validUsername = cell.getStringCellValue();
      
      
      FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
     Workbook wb1 = WorkbookFactory.create(fis2);
      Sheet sheet1 = wb1.getSheet("validcreds");
     Row row1 = sheet1.getRow(1);
    Cell cell1 = row1.getCell(1);
    String validPassword = cell1.getStringCellValue();
    Thread.sleep(2000);    
    
    driver.findElement(By.name("username")).sendKeys("validUsername");
    Thread.sleep(2000);
    driver.findElement(By.name("pwd")).sendKeys("validPassword");
    Thread.sleep(2000);
    
    driver.findElement(By.id("loginButton")).click();
     
	
	}

}
