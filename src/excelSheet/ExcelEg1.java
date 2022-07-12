package excelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
			File file = new File("C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Book1.xlsx");// TODO Auto-generated method stub
	
       String city = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(city);
        
        
        
       double number = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
       
       System.out.println(number);
       
      boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
       
       System.out.println(value);
       
       String charValue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
       System.out.println(charValue);
       
       
       
       
       
       
        }
	

}
