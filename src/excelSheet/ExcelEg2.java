package excelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file = new File("C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Book1.xlsx");
        Workbook work = WorkbookFactory.create(file);
        Sheet mySheet = work.getSheet("Sheet2");
        Row myRow = mySheet.getRow(1);
        Cell myCell = myRow.getCell(1);
        CellType cellInfo = myCell.getCellType();
        System.out.println(cellInfo);
        
        System.out.println("=====================");
        
       Sheet mySheet1=work.getSheet("Sheet2");
       for(int i=0;i<=1;i++)
       {
    	   for(int j=0;j<=2;j++)
    	   {
    		   String value = mySheet1.getRow(i).getCell(j).getStringCellValue();
    		   
    		   System.out.print(value+" ");
    	   }
    	   System.out.println();
       }
       System.out.println("==================");
        
	}

}
