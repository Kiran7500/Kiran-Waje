package excelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile = new File("C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Book1.xlsx");
        Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
        int totalNumberOfRows = mySheet.getLastRowNum();
        int rowCount = totalNumberOfRows;
        System.out.println("rowCount is" +rowCount);
        
        short totalNumberOfColumns = mySheet.getRow(rowCount).getLastCellNum();
        int columnCount = totalNumberOfColumns-1;
        
        System.out.println("Column count is"+columnCount);
        
        System.out.println("Cell type is"+mySheet.getRow(2).getCell(1).getCellType());
        
        for(int i=0;i<=rowCount;i++)
        {
        	for(int j=0;j<=columnCount;j++)
        	{
        		Cell myCell = mySheet.getRow(i).getCell(j);
        		CellType dataType = myCell.getCellType();
        		
        		if(dataType==CellType.STRING)
        		{
        			String value = myCell.getStringCellValue();
        			System.out.print(value+" ");
        		}
        		else if(dataType==CellType.BLANK)
        		{
        			System.out.print(" ");
        		}
        		
        		else if(dataType==CellType.BOOLEAN)
        		{
        			boolean value = myCell.getBooleanCellValue();
        			System.out.print(value+" ");
        		}
        		else if(dataType==CellType.NUMERIC)
        		{
        			double value = myCell.getNumericCellValue();
        			System.out.print(value+" ");
        		}
        		
        	}
        	System.out.println();
        }
        
        
        
        
        
        
        
	}

}
