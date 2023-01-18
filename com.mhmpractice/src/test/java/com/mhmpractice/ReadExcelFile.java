package com.mhmpractice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Read data from Excel File Using Apache POI
public class ReadExcelFile {

	// Main driver method
	public static void main(String[] args) {
		
		// Try block to check for exceptions
        try {
  
            // Reading file from local directory
            FileInputStream file = new FileInputStream(
                new File("MirFamily.xlsx"));
  
            // Create Workbook instance holding reference to
            // .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
  
            // Get first/desired sheet from the workbook
            //XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFSheet sheet = workbook.getSheet("Mir Family");
            
            // Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
  
            // Till there is an element condition holds true
            while (rowIterator.hasNext()) {
  
                Row row = rowIterator.next();
  
                // For each row, iterate through all the
                // columns
                Iterator<Cell> cellIterator
                    = row.cellIterator();
  
                while (cellIterator.hasNext()) {
  
                    Cell cell = cellIterator.next();
  
                    // Checking the cell type and format
                    // accordingly
                    //switch (cell.getCellType()) {
                    switch(cell.getCellType()) {
                    
                    // Case 1
                   //case Cell.CELL_TYPE_NUMERIC:	
                    case NUMERIC:
                        System.out.print(
                            cell.getNumericCellValue()
                            + "\t");
                        break;
  
                    // Case 2
                    //case Cell.CELL_TYPE_STRING:
                    case STRING:
                        System.out.print(
                            cell.getStringCellValue()
                            + "\t");
                        break;
                        
//                    case BOOLEAN:
//                        System.out.print(
//                            cell.getStringCellValue()
//                            + "\t");
//                        break;
                        
                    }
                }
  
                System.out.println("");
            }
  
            // Closing file output streams
            file.close();
        }
  
        // Catch block to handle exceptions
        catch (Exception e) {
  
            // Display the exception along with line number
            // using printStackTrace() method
            e.printStackTrace();
        }
		

	}

}
