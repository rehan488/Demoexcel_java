import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testclass {

	
	public static void main(String [] args) throws IOException
	{
		String filepath="/home/gangadhar/Documents/rehan/";
		 String excelFilePath = filepath+ "abc.xlsx";
	        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	    	System.out.println("Heading  values ");
	        Workbook workbook = new XSSFWorkbook(inputStream);
	        Sheet firstSheet = workbook.getSheetAt(0);
	        Iterator<Row> iterator = firstSheet.iterator();
	         
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	          
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                 
	             //   System.out.println(cell.getStringCellValue());
	                
	                switch (cell.getCellType()) {
	                    case Cell.CELL_TYPE_STRING:
	              
	                        System.out.print(cell.getStringCellValue());
	                        break;
	                    case Cell.CELL_TYPE_BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue());
	                        break;
	                    case Cell.CELL_TYPE_NUMERIC:
	                        System.out.print(cell.getNumericCellValue());
	                        break;
	                }
	                System.out.print(" - ");
	            }
	            System.out.println();
	        }
	        
	        
	        
	        
	        
	         
	        workbook.close();
	        inputStream.close();
	}
	
}
